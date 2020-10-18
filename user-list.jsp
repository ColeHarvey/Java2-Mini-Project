<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<h4>Select your name</h4>
	<br>
	<form method="post" action = "bikeNavigationServlet">
	<table>
	<c:forEach items="${requestScope.allUsers}" var="currentUser">
	<tr>
		<td><input type="radio" name="id" value="${currentUser.id}"></td>
		<td><h2>${currentUser.fName}</h2></td>
		<td><h2>${currentUser.lName}</h2></td></tr>
		<c:forEach var="bikeVal" items="currentUser.listOfBikes">
			<tr><td></td><td colspan="3">${bikeVal.make}, ${bikeVal.model}</td></tr>
			</c:forEach>
	</c:forEach>
	</table>
	<input type="submit" value="edit" name="doThisToUser">
	<input type="submit" value="delete" name="doThisToUser">
	<input type="submit" value="add" name="doThisToUser">
	</form>
	<a href="index.html">Home</a>
	<br>
	<a href="new-user.jsp">Add a new user</a>
</body>
</html>