package com.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.jar.Attributes.Name;

import com.util.DatabaseUtil;
import com.Model.*;

public class UserControler {
	public int insertRecord(User user)throws ClassNotFoundException,SQLException {
		int status=0;
		
		Connection con=DatabaseUtil.getConnection();
		String sql="insert into user (name,gender,address,contact) values(?,?,?,?)";		
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setString(1, user.getName());
		statement.setString(2, user.getGender());
		statement.setString(3, user.getAddress());
		statement.setString(4, user.getContact());
		status=statement.executeUpdate();
		
		 
		
		return status;
		
	}
	
	public int updateRecord(User user)throws ClassNotFoundException,SQLException {
		int status=0;
		
		Connection con=DatabaseUtil.getConnection();
		String sql="update user set name=?,gender=?,address=?,contact=? where id=?";		
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setString(1, user.getName());
		statement.setString(2, user.getGender());
		statement.setString(3, user.getAddress());
		statement.setString(4, user.getContact());
		statement.setInt(5, user.getId());
		status=statement.executeUpdate();
		
		 
		
		return status;
		
	}
	
	
	public int deleteRecord(int id)throws ClassNotFoundException,SQLException {
		int status=0;
		
		Connection con=DatabaseUtil.getConnection();
		String sql="delete from user where id=?";		
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1, id);
		
		status=statement.executeUpdate();
		
		 
		
		return status;
		
	}
	
	public ResultSet readRecord()throws ClassNotFoundException,SQLException{
		Connection con=DatabaseUtil.getConnection();
		ResultSet rs=null;
		Statement statement=con.createStatement();
		String sql="Select*from user";
	     rs=	statement.executeQuery(sql);
	     return rs;
		
	}

}
