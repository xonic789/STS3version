package com.bit.sts05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.sts05.dept.model.DeptDao;

// dao -> service -> controller �ؾ� autoWired�� ���԰���.

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptDao deptDao;
	
	@Override
	public void list(Model model) {
		System.out.println(deptDao);
		model.addAttribute("list",deptDao.selectAll());
	}
}
