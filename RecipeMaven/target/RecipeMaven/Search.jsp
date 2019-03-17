<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC -W3CDTD HTML 4.01 TransitionalEN
httpwww.w3.orgTRhtml4loose.dtd>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Enter the Id number for search here</h3>
<form action="SearchController" method="post">
<label>Id No: </label><input type="text"  name="id">
<input type="submit" value="Search">
</form>
<button type="button" onclick="update.jsp">Click Me!</button>
<a href="Delete.jsp">Delete</a>	<a href="index.jsp">Add</a> <a href="update.jsp">Update</a>
<h2>Data is:</h2>
<h>${dto1}</h>

</body>
</html>