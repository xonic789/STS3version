package com.bit.sts02.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts02.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll() throws SQLException;
	void insertOne(DeptVo bean) throws SQLException;
	DeptVo selectOne(int deptno) throws SQLException;
	int updateOne(DeptVo bean) throws SQLException;
	int deletOne(int deptno) throws SQLException;
}