package io.mars.support.controllers;

import java.util.Collections;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.mars.support.services.MarsFileServices;
import io.vertigo.account.security.UserSession;
import io.vertigo.account.security.VSecurityManager;
import io.vertigo.core.lang.VUserException;
import io.vertigo.core.node.Node;
import io.vertigo.datastore.filestore.model.FileInfo;
import io.vertigo.datastore.filestore.model.FileInfoURI;
import io.vertigo.datastore.filestore.model.VFile;
import io.vertigo.ui.core.UiFileInfoList;
import io.vertigo.ui.impl.springmvc.util.UiRequestUtil;
import io.vertigo.vega.webservice.stereotype.QueryParam;
import io.vertigo.vega.webservice.validation.UiMessageStack;
import io.vertigo.vega.webservice.validation.UiMessageStack.Level;

@Controller
@RequestMapping("/commons/")
public class FileUploadController {
	private static final String FILE_INFOS_SESSION_KEY = "uiFileInfos";
	private static final String FILE_INFOS_LAST_ACCESS_SESSION_KEY = "uiFileInfosLastAccess";
	private static final long PURGE_DELAY_SECOND = 300; //5 min after last acces we flush session

	@Inject
	private MarsFileServices commonsServices;

	@PostMapping("/upload")
	public FileInfoURI uploadFile(@QueryParam("file") final VFile vFile) {
		if (vFile.getFileName().toLowerCase().contains("virus")) {
			throw new VUserException("Il y a un virus dans votre PJ " + vFile.getFileName());
		}
		final FileInfo storeFile = commonsServices.saveFileTmp(vFile);
		obtainUiFileInfoListSession().add(storeFile);
		return storeFile.getURI();
	}

	@DeleteMapping("/upload")
	public FileInfoURI removeFile(@QueryParam("file") final FileInfoURI fileInfoUri) {
		//Don't remove file now : it may be needed it user go back before saving
		return fileInfoUri; //if no return, you must get the response. Prefer to return old uri.
	}

	private static UiFileInfoList<FileInfo> obtainUiFileInfoListSession() {
		final UserSession session = obtainSecurityManager().getCurrentUserSession().get();
		synchronized (session) {
			UiFileInfoList<FileInfo> uiFileInfoList = session.getAttribute(FILE_INFOS_SESSION_KEY);
			final Long lastAccess = session.getAttribute(FILE_INFOS_LAST_ACCESS_SESSION_KEY);
			final boolean triggerPurge = lastAccess != null && lastAccess < System.currentTimeMillis() - PURGE_DELAY_SECOND * 1000L;
			if (uiFileInfoList == null || triggerPurge) {
				uiFileInfoList = new UiFileInfoList<>(Collections.emptyList());
				session.putAttribute(FILE_INFOS_SESSION_KEY, uiFileInfoList);
			}
			session.putAttribute(FILE_INFOS_LAST_ACCESS_SESSION_KEY, System.currentTimeMillis());
			return uiFileInfoList;
		}
	}

	private static VSecurityManager obtainSecurityManager() {
		return Node.getNode().getComponentSpace().resolve(VSecurityManager.class);
	}

	@ResponseBody
	@ExceptionHandler(VUserException.class)
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	public static Object handleVUserException(final VUserException ex, final HttpServletRequest request) {
		final UiMessageStack uiMessageStack = UiRequestUtil.obtainCurrentUiMessageStack();
		uiMessageStack.addGlobalMessage(Level.ERROR, ex.getMessage());
		//---
		return uiMessageStack;
	}

}
