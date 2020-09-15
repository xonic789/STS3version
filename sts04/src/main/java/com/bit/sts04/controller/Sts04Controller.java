package com.bit.sts04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sts04Controller {
	
	@RequestMapping("/")
	public String index(Model model) {
		String[] arr= {
				"bigmeet1.jpg",
				"bigmeet2.jpg",
				"bigmeet3.jpg",
				"bigmeet4.jpg",
				"bigmeet5.jpg",
				"bigmeet6.jpg"
		};
		model.addAttribute("imgs",arr);
		return "home";
	}
	
}
