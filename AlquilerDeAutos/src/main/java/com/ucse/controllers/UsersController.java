package com.ucse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucse.model.User;
import com.ucse.services.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	@RequestMapping("/create")
	public ModelAndView users() {
		/*ModelAndView mv = new ModelAndView("createUser");
		return mv;*/
		User user = new User(32059919L, "Fede", "fede@pelle.com");
		usersService.create(user);
		ModelAndView mv = new ModelAndView("mainUsers");
		mv.addObject("dni", user.getDni());
		mv.addObject("name", user.getName());
		mv.addObject("mail", user.getMail());
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
