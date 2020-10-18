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
	<form method="post" action="listNavigationServlet">
	<table>
	<c:forEach items="${requestScope.allLists}" var="currentlist">
	<tr>
		<td><input type="radio" name="id" value="${currentlist.id}"></td>
		<td><h2>${currentlist.fName}, ${currentList.lName}</h2></td></tr>
		<td><h4>Age: ${currentlist.age}</h4></td>
		<c:forEach var="listVal" items="${currentlist.listOfItems}">
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