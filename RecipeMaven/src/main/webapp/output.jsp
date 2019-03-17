<%@page import="java.io.PrintWriter"%>
<%@page import="com.xworkz.web.dto.RecipeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC -W3CDTD HTML 4.01 TransitionalEN
httpwww.w3.orgTRhtml4loose.dtd>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="align: center">
		<font color="green" ,align="center">Data Saved Successfully</font>
	</h2>
	<h>${dto1}</h>
	<br>
	<br>
	<a href="index.jsp">Back To Home</a>
</body>
</html>