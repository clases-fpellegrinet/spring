package com.ucse.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ucse.services.LoginService;

@Controller
public class InitController {

	private static final Logger LOGGER = Logger.getLogger(InitController.class);

	@Autowired
	private LoginService loginService;
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping("/start")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(
			@RequestParam(value = "user", required = true) String user,
			@RequestParam(value = "password", required = true) String password) {
		ModelAndView mv = null;
		boolean isValidUser = loginService.isValidLogin(user, password);
		if (isValidUser) {
			mv = new ModelAndView("main");
			LOGGER.debug("User logged"+user+", "+password);
		}else {
			mv = new ModelAndView("main");
		}
		return mv;
	}
	
}
