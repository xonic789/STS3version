package com.bit.sts04.model;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/applicationContext.xml"
							,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class EmpDaoTest {
	@Autowired
	EmpDao empDao;

	@Test
	public void testSelectAll() throws SQLException {
		assertSame(0, empDao.selectAll().size());
	}

	@Test
	public void testSelectOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteOne() {
		fail("Not yet implemented");
	}

}