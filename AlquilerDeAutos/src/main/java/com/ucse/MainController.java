package com.ucse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/users")
	public ModelAndView users() {
		ModelAndView mv = new ModelAndView("mainUsers");
		return mv;
	}
	
	@RequestMapping("/cars")
	public ModelAndView cars() {
		ModelAndView mv = new ModelAndView("mainCars");
		return mv;
	}
	
	@RequestMapping("/rents")
	public ModelAndView rents() {
		ModelAndView mv = new ModelAndView("mainRents");
		return mv;
	}
}
