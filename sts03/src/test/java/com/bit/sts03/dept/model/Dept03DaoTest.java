package com.bit.sts03.dept.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.sts03.dept.model.entity.Dept03Vo;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Dept03DaoTest {
	static Dept03Vo target = new Dept03Vo(1,"test","test");
	Dept03Dao dept03Dao;
//	@FixMethodOrder(MethodSorters.DEFAULT)  			�׽�Ʈ�� ����� �� �� ������ ������ ������� �ʽ��ϴ�.	
//	@FixMethodOrder(MethodSorters.NAME_ASCENDING)		�޼ҵ�� ���������Ͽ� ������������ ����˴ϴ�.		
//	@FixMethodOrder(MethodSorters.JVM) 					�׽�Ʈ����� JVM�� ������ ������� ����˴ϴ�. 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String sql="create table `dept03` (`deptno` INT NOT NULL AUTO_INCREMENT,`dname` VARCHAR(10) NULL DEFAULT NULL,`loc` VARCHAR(10) NULL DEFAULT NULL,PRIMARY KEY (`deptno`))";
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		DataSource dataSource = (DataSource)ac.getBean("dataSource");
		Connection conn= dataSource.getConnection();
		
		System.out.println(sql);
		conn.prepareStatement(sql).execute();
		conn.prepareStatement("insert into dept03 (dname,loc) values ('"
				+target.getDname()+"','"+target.getLoc()+"')").executeUpdate();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		File file = new File("C:\\data\\xeTest.mv.db");
		if(file.exists()) {
			file.deleteOnExit();;
		}
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		dept03Dao = (Dept03Dao) ac.getBean("dept03Dao");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testSelectAll() throws SQLException {
		
//		assertNotNull(dept03Dao.selectAll());
		System.out.println(dept03Dao.selectAll());
		assertSame(2, dept03Dao.selectAll().size());
	}
	
	@Test
	public void testSelectOne() throws SQLException {
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		dept03Dao = (Dept03Dao) ac.getBean("dept03Dao");
		
		assertEquals(target, dept03Dao.selectOne(target.getDeptno()));
	}
	@Test
	public void testInsertOne() {
		try {
			dept03Dao.insertOne(target);
		} catch (SQLException e) {
			assertFalse(true);
		}
	}
	@Test
	public void testUpdate() throws SQLException {
//		target=new Dept03Vo(target.getDeptno(),"test1","test2");
		target.setDname("test1");
		target.setLoc("test1");
		assertSame(1,dept03Dao.updateOne(target));
	}
	@Test
	public void testZDeleteOne() throws SQLException {
		assertSame(1,dept03Dao.zdeleteOne(target.getDeptno()));
	}

}
