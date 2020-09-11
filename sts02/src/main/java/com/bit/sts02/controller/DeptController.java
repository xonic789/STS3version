package com.bit.sts02.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.sts02.model.DeptDao;
import com.bit.sts02.model.entity.DeptVo;

@Controller
@RequestMapping("/dept/")
public class DeptController {
	
	//Dept table CRUD
	@Autowired
	private DeptDao deptDao;
	
//	public void setDeptDao(DeptDao deptDao) {
//		this.deptDao = deptDao;
//	}
	
	// Dept CRUD
	@RequestMapping("list")
	public String list(Model model) throws SQLException {
		model.addAttribute("list",deptDao.selectAll());
		return "deptList";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String add() {
		return "deptAdd";
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String insert(@ModelAttribute DeptVo bean) throws SQLException {
		deptDao.insertOne(bean);
		return "redirect:list";
	}
	@RequestMapping(value = "detail")
	public String detail(@RequestParam("deptno") int deptno,Model model) throws SQLException {
		model.addAttribute("bean",deptDao.selectOne(deptno));
		model.addAttribute("title1","��");
		model.addAttribute("title2","DETAIL");
		model.addAttribute("readonly","readonly");
		return "deptOne";
	}
	@RequestMapping(value = "edit",method = RequestMethod.GET)
	public String edit(@RequestParam("deptno") int deptno,Model model) throws SQLException {
		model.addAttribute("bean",deptDao.selectOne(deptno));
		model.addAttribute("title1","����");
		model.addAttribute("title2","edit");
		model.addAttribute("readonly","");
		return "deptOne";
	}
	@RequestMapping(value = "edit",method = RequestMethod.POST)
	public String update(@ModelAttribute DeptVo bean) throws SQLException {
		deptDao.updateOne(bean);
		return "redirect:detail?deptno="+bean.getDeptno();
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam("deptno") int deptno) throws SQLException {
		deptDao.deletOne(deptno);
		return null;
	}
}
