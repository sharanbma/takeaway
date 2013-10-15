package com.khanavali.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuViewController {

	public MenuViewController() {
		System.out.println("CAlling");
	}

	@RequestMapping("/")
	public String prepare(Model model) {
		
		return "home";
	}

}
