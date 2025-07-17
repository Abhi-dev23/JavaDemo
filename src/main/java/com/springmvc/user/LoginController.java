package com.springmvc.user;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.LoginDAO;
import com.spring.dto.LoginDTO;

@Controller
public class LoginController 
{
	@RequestMapping("/login")
	public String disp_log(LoginDTO obj, Model model)
	{
		model.addAttribute("user",obj);
		return "Login.jsp";
	}
	
	@PostMapping("/validate")
	public String validate_log(LoginDTO obj, Model model) throws SQLException
	{
		LoginDAO loginDAO = new LoginDAO();
		boolean res = loginDAO.check_user(obj);
		
		if(res)
		{
			model.addAttribute("user",obj);
			return "Menu.jsp";
		}
		else
		{
			model.addAttribute("user",obj);
			model.addAttribute("err","Invalid User...");
			return "Login.jsp";
		}
	}
}
