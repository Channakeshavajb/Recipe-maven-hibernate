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
<h2>Enter the name for delete</h2>
<form action="DeleteController" method="post">
<label>Id:</label><input type="text" name="id">
<input type="submit" value="Delete">
</form>
<a href="update.jsp"><button>Update</button></a> <a href="index.jsp"><button>Add</button></a> <a href="Search.jsp"><button>Search</button></a>

<h2>Deleted Data is:</h2>
<h>${dts}</h>

</body>
</html>