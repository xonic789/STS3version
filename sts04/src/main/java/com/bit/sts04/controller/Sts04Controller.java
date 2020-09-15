package com.bit.sts04.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sts04Controller {
	
	@Autowired
	DataSource dataSource;
	
	@RequestMapping("/")
	public String index(Model model) throws SQLException {
		System.out.println(dataSource.getConnection());
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
