package io.mars.basemanagement.controllers.base;

import java.time.Instant;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.mars.basemanagement.domain.Event;
import io.mars.support.MarsUserSession;
import io.vertigo.account.authorization.VSecurityException;
import io.vertigo.account.authorization.annotations.Secured;
import io.vertigo.account.security.VSecurityManager;
import io.vertigo.core.locale.MessageText;
import io.vertigo.datamodel.structure.model.DtList;
import io.vertigo.ui.core.ViewContext;
import io.vertigo.ui.core.ViewContextKey;
import io.vertigo.ui.impl.springmvc.controller.AbstractVSpringMvcController;

@Controller
@Secured("ViewBases")
@RequestMapping("/basemanagement/base/planning")
public class BasePlanningController extends AbstractVSpringMvcController {
	private static final ViewContextKey<Boolean> isMyBase = ViewContextKey.of("isMyBase");
	private static final ViewContextKey<Instant> todayDate = ViewContextKey.of("todayDate");
	private static final ViewContextKey<Event> events = ViewContextKey.of("events");

	@Inject
	private VSecurityManager securityManager;
	@Inject
	private BaseDetailController baseDetailController;

	@GetMapping("/{baseId}")
	public void initContext(final ViewContext viewContext, @PathVariable("baseId") final Long baseId) {
		baseDetailController.initCommonContext(viewContext, baseId);
		viewContext.publishRef(isMyBase, baseId.equals(getUserSession().getCurrentProfile().getBaseId()));
		viewContext.publishRef(todayDate, Instant.now());
		viewContext.publishDtList(events, new DtList<>(Event.class));
		toModeReadOnly();
	}

	private MarsUserSession getUserSession() {
		return securityManager.<MarsUserSession> getCurrentUserSession().orElseThrow(() -> new VSecurityException(MessageText.of("No active session found")));
	}

}
