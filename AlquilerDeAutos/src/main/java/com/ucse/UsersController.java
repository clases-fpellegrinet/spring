package com.ucse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UsersController {

	@RequestMapping("/create")
	public ModelAndView users() {
		ModelAndView mv = new ModelAndView("createUser");
		return mv;
	}
	
	@RequestMapping("/modify")
	public ModelAndView cars() {
		ModelAndView mv = new ModelAndView("modifyUser");
		return mv;
	}
	
	@RequestMapping("/search")
	public ModelAndView rents() {
		ModelAndView mv = new ModelAndView("searchUser");
		return mv;
	}
}
