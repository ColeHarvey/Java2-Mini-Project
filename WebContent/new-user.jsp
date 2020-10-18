<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
</head>
<body>
	<form action = "createNewUserServlet" method="post">
		First Name: <input type="text" name="fName">
		Last Name: <input type="text" name="lName">
		Age: <input type="text" name="age">
	</form>
	<input type="submit" value="Create New User">
	<br>
	<a href="index.html">Home</a>
	<a href="viewAllBikesServlet">View All Bikes</a>
	<a href="viewAllListsServlet">View All Lists</a>
</body>
</html>