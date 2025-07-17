<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
      <li class="active"><a href="Menu.jsp">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="Menu.jsp">Home Menu
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Menu.jsp">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Products
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Add Product</a></li>
          <li><a href="productlist">View Products</a></li>
         
        </ul>
      </li>
      <li><a href="#">Stock</a></li>
      <li><a href="#">Billing</a></li>
       <li><a href="LogoutServlet">Logout</a></li>
    </ul>
  </div>
</nav>

<h2>Welcome User...</h2>
<div>User Name : ${user.un}</div>

 <script src = "https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>    
 <script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>   

</body>
</html>