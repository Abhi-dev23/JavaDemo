package com.springmvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.RegisterDAO;
import com.spring.dto.RegisterDTO;

@Controller
public class RegisterController 
{
	@RequestMapping("/register")
	public String disp_regi(RegisterDTO obj, Model model)
	{
		model.addAttribute("reginfo",obj);
		return "Register.jsp";
	}
	
	@PostMapping("/registration")
	public String registration(RegisterDTO obj, Model model)
	{
		try
		{
			RegisterDAO dao = new RegisterDAO();
			boolean rs = dao.check_regi(obj);
			if(rs)
			{
				model.addAttribute("reginfo",obj);
				model.addAttribute("msg","User Aready Exists");
			}
			else
			{
				int i = dao.register_user(obj);
				if(i>0)
				{
					model.addAttribute("reginfo",obj);
					model.addAttribute("msg","User Registered Successfully");
				}
				else
				{
					model.addAttribute("reginfo",obj);
					model.addAttribute("msg","Error in User Registration");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Register.jsp";
	}
}
