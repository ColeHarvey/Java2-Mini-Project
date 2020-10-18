<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a Bike</title>
</head>
<body>
	<form action="editBikeServlet" method="post">
		Make: <input type="text" name="make" value="${bikeToEdit.make}">
		Model: <input type="text" name="model" value="${bikeToEdit.model}">
		Year: <input type="number" name="year" value="${bikeToEdit.year}">
		Quality: <input type="text" name="quality" value="${bikeToEdit.quality}">
		Cost: <input type="text" name="cost" value="${bikeToEdit.cost}">
		<input type="hidden" name="id" value="${bikeToEdit.id}">
		<input type="submit" value="Save Edited Bike">
	</form>
</body>
</html>