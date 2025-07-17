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
<h2>New User Registration...</h2>
<div class="container-fluid">
 <form:form method="post" action="registration" modelAttribute="reginfo">
  <table class="table table-striped">
   <tr>
      <td>Employee Name : </td>
      <td><form:input path="nm" id="un"/> </td>
   </tr>
   <tr>
      <td>User Name : </td>
      <td><form:input path="un" id="un"/> </td>
   </tr>
   <tr>
      <td>Password : </td>
      <td><form:password path="ps" id="ps"/> </td>
   </tr>
   <tr>
      <td>Email : </td>
      <td><form:input path="em" id="un"/> </td>
   </tr>
   <tr>
      <td>Mobile No.: </td>
      <td><form:input path="mb" id="un"/> </td>
   </tr>
   <tr>
      <td><a href="login">Login</a> </td>
      <td><input type="submit" name="rg" value="Register" class="btn btn-success"> 
          <input type="reset" name="rs" value="Reset" class="btn btn-danger"> </td>
   </tr>
  </table>
${msg}
 </form:form>
</div>

 <script src = "https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>    
 <script src = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>   
 
</body>
</html>