package com.cts.srcmed.controller;

import com.cts.srcmed.exception.*;


import com.cts.srcmed.model.User;
import com.cts.srcmed.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String home() {
		return "UserLogin";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		try {
			loginService.login(username, password);

			String designation = loginService.getDesignation(username);
			model.addAttribute("designation", designation);

			if (designation.equalsIgnoreCase("Admin")) {
				return "adminPage";
			}

			return "welcome";
		} catch (UserDoesNotExistException | InvalidCredentialsException e) {
			model.addAttribute("error", e.getMessage());
			return "UserLogin";
		}
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user, Model model) {

		if (loginService.isUserAlreadyPresent(user.getUsername())) {
			model.addAttribute("error", "Username already exists");
			return "register";
		}

		loginService.saveUser(user);
		model.addAttribute("success", "User registered successfully");
		return "UserLogin";
	}

	@GetMapping("/logout")
	public String logout() {
		return "UserLogin";
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		return "errorPage";
	}
}
