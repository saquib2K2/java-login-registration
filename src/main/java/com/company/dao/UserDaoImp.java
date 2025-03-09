package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		
		String query = "SELECT FROM users WHERE username = ? AND password = ?";
		
		try(Connection connection = DBUtil.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(query)) {
			
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			System.out.println("query run ho rahi h..");
			ResultSet resultSet = pstmt.executeQuery();
			
			return resultSet.next();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addUser(Users user) {
		
		String query = "INSERT INTO users (username , email , password) VALUES (?, ?, ?)";
		
		try(Connection connection = DBUtil.getConnection();
			 PreparedStatement pstmt = connection.prepareStatement(query)) {
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			
			
			 int rows = pstmt.executeUpdate();
			System.out.println("user apna add holiya balle balle..");
			return rows>0;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
		

}
