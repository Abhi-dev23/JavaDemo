package com.springmvc.user;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.ProductDAO;
import com.spring.dto.ProductDTO;

@Controller
public class ProductController 
{
	@RequestMapping("/product")
	public String disp_prod(ProductDTO obj, Model model)
	{
		model.addAttribute("prodinfo",obj);
		return "Product.jsp";
	}
	
	@PostMapping("/save_prod")
	public String save_prod(ProductDTO obj, Model model)
	{
		try
		{
			ProductDAO dao = new ProductDAO();
			int i = dao.add_prod(obj);
			
			if(i>0)
			{
				model.addAttribute("prodinfo",obj);
				model.addAttribute("msg","Product Added Successfully");
			}
			else
			{
				model.addAttribute("prodinfo",obj);
				model.addAttribute("msg","Something Went Wrong");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Product.jsp";
	}
	
	@GetMapping("/productlist")
	public String prodlist(ProductDTO obj, Model model) throws SQLException
	{
		ProductDAO obj2=new ProductDAO();
		List<ProductDTO> listproducts= obj2.listAllProducts();
		
		model.addAttribute("ProdLst",listproducts);
		return "Product_List.jsp";
	}
}
