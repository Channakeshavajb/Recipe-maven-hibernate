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
<a href="Delete.jsp"><button>Delete</button></a>	<a href="index.jsp"><button>Add</button></a> <a href="update.jsp"><button>Update</button></a>
<h2>Data is:</h2>
<h>${dto1}</h>

</body>
</html>