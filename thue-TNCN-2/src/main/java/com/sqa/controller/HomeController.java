package com.sqa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import com.sqa.models.entities.Nguoinopthue;
import com.sqa.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String viewHome(Model model, @CookieValue(value = "userId", defaultValue = "null") String userId) {

		if (userId == null) {
			model.addAttribute("user", new Nguoinopthue());
			return "redirect:/authen/login";
		} else {
			Nguoinopthue user = userService.get(userId);
			model.addAttribute("user", user);
			return "home";
		}

		
	}
}
