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

	<h2>Enter the details here</h2>
	<form action="UpdateController" method="post">
		<pre>
<label>Id : 	 </label><input type="text" name="id"><br>
<label>Name :    </label><input type="text" name="name"><br>
<label>Types :   </label><input type="text" name="types"><br>
<label>Price :   </label><input type="text" name="price"><br>
<input type="submit" value="Update"> <input type="reset"
				value="Reset">

</pre>
	</form>
	<a href="Delete.jsp">Delete</a>
	<a href="index.jsp">Add</a>
	<a href="Search.jsp">Search</a>
	<h2>Updated Data is:</h2>
	<h>${dts}</h>

</body>
</html>