package com.bit.sts03.dept.model;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dept03DaoTest {

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectAll() {
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		Dept03Dao dept03Dao = (Dept03Dao) ac.getBean("dept03Dao");
		assertNotNull(dept03Dao.selectAll());
	}
	
	@Test
	public void testFirst() throws SQLException {
		ApplicationContext ac;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		DataSource dataSource = (DataSource)ac.getBean("dataSource");
		Connection conn= dataSource.getConnection();
		String sql="create table `dept03` (`deptno` INT NOT NULL AUTO_INCREMENT,`dname` VARCHAR(10) NULL DEFAULT NULL,`loc` VARCHAR(10) NULL DEFAULT NULL,PRIMARY KEY (`deptno`))";
		System.out.println(sql);
		conn.prepareStatement(sql).execute();
	}

}
