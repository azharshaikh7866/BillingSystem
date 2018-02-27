package com.bi.billing.controller;

import java.util.ArrayList;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	
	@GetMapping("/login")
	public String loginView(){
		return "login";
	}
	
/*	@PostMapping("/home")
	public String homePage(Model model) {
		return "bill/home";
	}*/
	
	@GetMapping("/htmlTest")
	public String homePage(Model model) {
		return "bill/tableHtml";
	}
	
}
