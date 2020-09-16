package com.bit.sts05.dept.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.sts05.dept.model.entity.DeptVo;

@Repository
public class DeptDaoImpl implements DeptDao {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public DeptDaoImpl() {
		System.out.println("create dao");
	}
	@Override
	public List<DeptVo> selectAll(){
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
				){
			return sqlSession.selectList("dept.selectAll");
		}
	}
	
	@Override
	public List<DeptVo> selectAll(int begin){
		try(
				SqlSession sqlSession = sqlSessionFactory.openSession();
				){
			return sqlSession.selectList("dept.selectAll",begin);
		}
	}
	
}
