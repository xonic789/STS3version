package com.bit.sts03.dept.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts03.dept.model.Dept03Dao;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	Dept03Dao dept03Dao;
	
	
	@RequestMapping("/")
	public String list(Model model) throws SQLException {
		model.addAttribute("list",dept03Dao.selectAll());
		return "dept/list";
	}
}
