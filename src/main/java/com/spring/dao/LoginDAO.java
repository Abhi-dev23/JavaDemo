package com.spring.dao;

import java.sql.*;

import com.spring.dto.LoginDTO;

public class LoginDAO
{
	public boolean check_user(LoginDTO loginDTO) throws SQLException
	{
		ResultSet rs = null;
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb","root","sabedor");
		
		String qur = "SELECT * FROM empinfo WHERE username=? AND userpass=?";
		PreparedStatement preparedStatement = conn.prepareStatement(qur);
		preparedStatement.setString(1, loginDTO.getUn());
		preparedStatement.setString(2, loginDTO.getPs());
		rs = preparedStatement.executeQuery();
		
		if(rs.next())
			return true;
		else
			return false;
	}
}
