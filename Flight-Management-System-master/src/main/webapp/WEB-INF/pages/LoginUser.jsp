<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@taglib uri = "http://www.springframework.org/tags/form" prefix ="form" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 

<style>
body {
background-color:  #b3ffcb;
padding: 40px;
 }
 
 div { background-color:  #ccffdc;}


</style>
</head>

<body>

<center>
<h2 align ="center">User LogIn</h2>
<br><br><br>
<div>
<form:form action = "/loginUser" modelAttribute="user">
<table>
<tr>
<td>User Name:</td>
<td> <form:input path = "userName" name = "userName"/></td>
</tr>
<tr>
<td>Password: </td>
<td><form:input type="password" path = "password" name="password"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login" /></td>
</tr>
</table>
</form:form>
</div>
</center>


</body>

</html>