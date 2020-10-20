<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New List</title>
</head>
<body>
    <form action = "createNewListServlet" method="post">
        User List Name: <input type="text" name="listName"><br/>
        User First Name: <input type="text" name="first_Name"><br/>
        User Last Name: <input type="text" name="last_Name"><br/>
        User Age: <input type="text" name="age"><br/>
        Available Bikes: <br/>
    <select name="allBikesToAdd" multiple size="6">
    <c:forEach items="${requestScope.allBikes}" var="currentbike">
        <option value="${currentbike.bike_Id}">${currentbike.make}|${currentbike.model}|${currentbike.year}${currentbike.quality}${currentbike.price}</option>
    </c:forEach>
    </select>
    <br/>
    <input type="submit" value="Create List and Add Bikes">
    </form>
    <a href="index.html">Home</a>
</body>
</html>