package com.bit.sts02.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.h2.jdbcx.JdbcConnectionPool;

import com.bit.sts02.model.entity.DeptVo;

public class DeptDao1Impl implements DeptDao {
	JdbcConnectionPool jdbcConnectionPool;
	
	public void setJdbcConnectionPool(JdbcConnectionPool jdbcConnectionPool) {
		this.jdbcConnectionPool = jdbcConnectionPool;
	}
	
	
	@Override
	public List<DeptVo> selectAll() throws SQLException{
		String sql="select * from dept";
		List<DeptVo> list = new ArrayList<DeptVo>();
		try(
				Connection conn = jdbcConnectionPool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				){
			while(rs.next()) {
				list.add(new DeptVo(rs.getInt("deptno"), rs.getString("dname"),rs.getString("loc") ));
			}
			
		}
		
		return list;
	}
}
