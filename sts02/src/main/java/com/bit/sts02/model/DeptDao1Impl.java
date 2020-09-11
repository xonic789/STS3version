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


	@Override
	public void insertOne(DeptVo bean) throws SQLException {
		String sql="insert into dept values (?,?,?)";
		try(
				Connection conn = jdbcConnectionPool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, bean.getDeptno());
			pstmt.setString(2, bean.getDname());
			pstmt.setString(3, bean.getLoc());
			pstmt.executeUpdate();
		}
	}


	@Override
	public DeptVo selectOne(int deptno) throws SQLException {
		String sql="select * from dept where deptno=?";
		try(
				Connection conn=jdbcConnectionPool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return new DeptVo(rs.getInt("deptno"),rs.getString("dname") ,rs.getString("loc") );
			}
		}
		return null;
	}


	@Override
	public int updateOne(DeptVo bean) throws SQLException {
		String sql="update dept set dname=?,loc=? where deptno=?";
		try(
				Connection conn=jdbcConnectionPool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				){
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.setInt(3, bean.getDeptno());
			return pstmt.executeUpdate();
		}
	}


	@Override
	public int deletOne(int deptno) throws SQLException {
		String sql="delete from dept where deptno=?";
		try(
				Connection conn = jdbcConnectionPool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, deptno);
			return pstmt.executeUpdate();
		}
	}
}
