<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike List by User</title>
</head>
<body>
	<form method="post" action="userListNavigationServlet">
	<table>
	<c:forEach items="${requestScope.allUsers}" var="currentlist">
	<tr>
		<td><input type="radio" name="id" value="${currentlist.user_id}"></td>
		<td><h2>${currentlist.first_name}, ${currentList.last_name}</h2></td></tr>
		<td><h4>Age: ${currentlist.age}</h4></td>
		<c:forEach var="listVal" items="${currentlist.listOfBikes}">
			<tr><td></td><td colspan="3">
				${listVal.make} , ${listVal.model}, ${listVal.year}
				</td>
			</tr>
		</c:forEach>
	</c:forEach>
	</table>
	<input type="submit" value="edit" name="doThisToList">
	<input type="submit" value="delete" name="doThisToList">
	<input type="submit" value="add" name="doThisToList">
	</form>
	<a href="index.html">Home</a>
</body>
</html>