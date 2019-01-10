package io.mars.commons.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.vertigo.ui.core.ViewContext;
import io.vertigo.ui.impl.springmvc.controller.AbstractVSpringMvcController;

@Controller
@RequestMapping("/share")
public class ShareController extends AbstractVSpringMvcController {

	@GetMapping("/")
	public void initContext(final ViewContext viewContext) {
		// nothing
	}

}
