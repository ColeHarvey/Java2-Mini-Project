<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit List</title>
</head>
<body>
		<form action="editListDetailsServlet" method="post">
		<input type="hidden" name="id" value="${listToEdit.id}">
		User First Name: <input type="text" name="fName" value="${listToEdit.fName}">
		User Last Name: <input type="text" name="lName" value="${listToEdit.lName}">
		User Age: <input type="number" name="age" value="${listToEdit.age}">
		<input type="submit" value="Edit List">
		</form>
</body>
</html>