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
<h2>User Login...</h2>
<div class="container-fluid">
<form:form method="post" action="validate" modelAttribute="user">
 <table class="table table-striped">
   <tr>
      <td>User Name : </td>
      <td><form:input path="un" id="un"/> </td>
   </tr>
   <tr>
      <td>Password : </td>
      <td><form:password path="ps" id="ps"/> </td>
   </tr>
   <tr>
      <td><a href="register">Register</a> </td>
      <td><input type="submit" name="lg" value="Login" class="btn btn-success"> </td>
   </tr>
 </table>
${err}
</form:form>
</div>

 <script src = "https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>    
 <script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>   

</body>
</html>