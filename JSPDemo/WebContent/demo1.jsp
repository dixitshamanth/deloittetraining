<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
<h1>Welcome</h1>
<% for(int i=0;i<5;i++) {%>
<h2>Your name here</h2>
<%}int marks=96; %>
<%if(marks>90)
	out.println("Congrats Awesome");
	else
	%>
	<h3>Your marks is <%=marks %></h3>
</body>
</html>