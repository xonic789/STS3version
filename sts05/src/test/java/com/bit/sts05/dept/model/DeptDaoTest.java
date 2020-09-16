package com.bit.sts05.dept.model;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import com.bit.sts05.service.DeptService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class DeptDaoTest {
	@Autowired
	DeptService deptService;

	
	@Test
	public void testSelectAll() {
		deptService.list(null);
	}

}
