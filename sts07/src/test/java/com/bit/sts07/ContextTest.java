package com.bit.sts07;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sun.net.www.content.text.plain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
	@Inject
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testBean() {
		assertNotNull(sqlSessionFactory);
	}
}
