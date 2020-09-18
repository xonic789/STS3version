package com.bit.sts07.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.Model;

import com.bit.sts07.model.entity.EmpVo;

public interface EmpService {
	void listService(Model model) throws SQLException;
	}
