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
	public void serUserService(UsersService usersService) {
		this.usersService = usersService;
	}
	@RequestMapping("/create")
	public ModelAndView users() {
		/*ModelAndView mv = new ModelAndView("createUser");
		return mv;*/
		User user = new User(32059919L, "Fede", "Pellegrinet", "fede@pelle.com");
		usersService.create(user);
		ModelAndView mv = new ModelAndView("mainUsers");
		mv.addObject("dni", user.getDni());
		mv.addObject("firstname", user.getFirstname());
		mv.addObject("lastname", user.getLastname());
		mv.addObject("mail", user.getEmail());
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
