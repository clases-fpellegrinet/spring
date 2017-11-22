package com.ucse.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ucse.model.User;
import com.ucse.services.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
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
	
	@RequestMapping("/saveUser")
	public ModelAndView save(@RequestParam(value = "dni", required = true) String dni,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "mail", required = true) String mail,
			@RequestParam(value = "birthdate", required = true) String birthdate) {
		ModelAndView mv = new ModelAndView("mainUsers");
		try {
			User user = new User(new Long(dni), name, lastname, mail, birthdate);
			usersService.create(user);
			mv.addObject("dni", user.getDni());
			mv.addObject("name", user.getFirstname());
			mv.addObject("lastname", user.getLastname());
			mv.addObject("mail", user.getEmail());
			mv.addObject("birthdate", user.getBirthdate());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mv;
	}
}
