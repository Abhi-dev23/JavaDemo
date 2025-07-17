package com.spring.dao;

import java.sql.*;

import com.spring.dto.RegisterDTO;

public class RegisterDAO 
{
	public boolean check_regi(RegisterDTO dto) throws SQLException
	{
		ResultSet rs = null;
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb","root","sabedor");
		
		String qur = "SELECT * FROM empinfo WHERE username=?";
		PreparedStatement preparedStatement = conn.prepareStatement(qur);
		preparedStatement.setString(1, dto.getUn());
		rs = preparedStatement.executeQuery();
		
		if(rs.next())
			return true;
		else
			return false;
	}
	
	public int register_user(RegisterDTO dto) throws SQLException
	{
		int i = 0;
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb","root","sabedor");
		
		String str = "INSERT INTO empinfo(empname,username,userpass,email,mobile) VALUES(?,?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(str);
		preparedStatement.setString(1, dto.getNm());
		preparedStatement.setString(2, dto.getUn());
		preparedStatement.setString(3, dto.getPs());
		preparedStatement.setString(4, dto.getEm());
		preparedStatement.setString(5, dto.getMb());
		i = preparedStatement.executeUpdate();
		return i;
	}
}
