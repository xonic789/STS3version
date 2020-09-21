package com.bit.sts08;

import static org.junit.Assert.assertSame;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
	Logger log = LoggerFactory.getLogger(ContextTest.class);
	@Inject
	JdbcTemplate JdbcTemplate;
	
	@Test
	public void testDataSource() throws SQLException {
		assertSame(14,JdbcTemplate.queryForList("select * from dept03").size());
		JdbcTemplate.update("insert into dept03(dname,loc) values ('test','test')");
		assertSame(14,JdbcTemplate.queryForList("select * from dept03").size());
	}
	
}
