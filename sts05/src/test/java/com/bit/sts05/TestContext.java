package com.bit.sts05;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bit.sts05.dept.model.entity.DeptVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class TestContext {
	org.slf4j.Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DataSource dataSource;
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testDataSource() throws SQLException {
		Connection conn = dataSource.getConnection();
		log.debug(conn.toString());
		assertNotNull(conn);
	}
	@Test
	public void testSqlSessionFactory() {
		assertNotNull(sqlSessionFactory);
	}
	@Test
	public void testSelected() {
		try(SqlSession session=sqlSessionFactory.openSession()){ 
			log.debug(session.getConnection().toString());
			Map<String, Object> taget = new HashMap<String, Object>();
			taget.put("dname","tester");
			taget.put("loc","ÇÐ¿ø");
			taget.put("deptno",1234);
			session.insert("test.insertTest",taget);
			
			Map<String,Object> map = session.selectOne("test.selectDept",1234);
//			Set<Entry<String, Object>> entrySet=map.entrySet();
//			Iterator<Entry<String, Object>> ite = entrySet.iterator();
//			while(ite.hasNext()) {
//				Entry<String,Object> entry = ite.next();
//				log.debug(entry.getKey() + ":"+ entry.getValue() );
//			}
			assertSame(1, session.delete("test.deleteTest",1234));  

		}
	}
	@Test
	public void testSelectDept() {
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
				){
			sqlSession.selectList("dept.selectDept",new DeptVo(9, "test1",null));
		}
	}
	@Test
	public void testSelectEach() {
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
				){
			List list = new ArrayList<String>();
			list.add(3);
			list.add(5);
			list.add(7);
			sqlSession.selectList("dept.selectEach",list);
		}
	}
	
}
