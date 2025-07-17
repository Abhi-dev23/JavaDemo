<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href  = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Sabedor Software</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Home Menu
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Products
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Product.jsp">Add Product</a></li>
          <li><a href="ProductServlet">View Products</a></li>
         
        </ul>
      </li>
      <li><a href="#">Stock</a></li>
      <li><a href="#">Billing</a></li>
       <li><a href="LogoutServlet">Logout</a></li>
    </ul>
  </div>
</nav> 

         <table  class="table table-hover" style="width: 90%">
			  <thead class="thead-dark">
				    <tr>
				      <th scope="col">Product ID</th>
				      <th scope="col">Product Name</th>
				      <th scope="col">Company</th>
				      <th scope="col">Model</th>
				      <th scope="col">Quantity</th>
				      <th scope="col">Edit</th>
				       <th scope="col">Delete</th>
				    </tr>
              </thead>
            <c:forEach var="prd" items="${ProdLst}">
                <tr>
                    <td><c:out value="${prd.pid}"></c:out> </td>
                    <td><c:out value="${prd.pn}" /></td>
                    <td><c:out value="${prd.cm}" /></td>
                    <td><c:out value="${prd.md}" /></td>
                    <td><c:out value="${prd.qt}" /></td>
                     <td><a href="#">Edit</a></td>
                     <td><a href="#">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
 
<script src = "https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>    
<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 

</body>
</html>