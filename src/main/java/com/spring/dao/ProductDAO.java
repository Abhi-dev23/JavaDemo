package com.spring.dao;

import java.sql.*;
import java.util.*;

import com.spring.dto.ProductDTO;

public class ProductDAO
{
	public int add_prod(ProductDTO dto) throws SQLException
	{
		int i = 0;
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb","root","sabedor");
		
		String qur = "INSERT INTO products(productname,company,model,quantity) VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(qur);
		preparedStatement.setString(1, dto.getPn());
		preparedStatement.setString(2, dto.getCm());
		preparedStatement.setString(3, dto.getMd());
		preparedStatement.setInt(4, dto.getQt());
		i = preparedStatement.executeUpdate();
		return i;
	}
	
    public List<ProductDTO> listAllProducts() throws SQLException
    {
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb","root","sabedor");
      
		List<ProductDTO> listProd = new ArrayList<ProductDTO>();
         
        String sql = "SELECT * FROM products"; 
      
        PreparedStatement prepParedStatement=conn.prepareStatement(sql);
        ResultSet rs = prepParedStatement.executeQuery(sql);
         
        while (rs.next()) {
        	
            int pid = rs.getInt("pid"); 
            String productname = rs.getString("productname");
            String company = rs.getString("company"); 
            String model = rs.getString("model"); 
            int quantity= rs.getInt("quantity"); 
           
            ProductDTO obj =new ProductDTO();
            obj.setPid(pid);
            obj.setPn(productname);
            obj.setCm(company);
            obj.setMd(model);
            obj.setQt(quantity);
            
           listProd.add(obj);
           
        }
         
        rs.close();
        prepParedStatement.close();
        return listProd;
        
    }	
	
}
