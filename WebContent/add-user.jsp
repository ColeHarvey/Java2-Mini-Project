<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
    <div class="container">
    <h2>Add a User to our User list</h2>
    <form action="addUserServlet" method="post">
    <div class="form-group">
    <label for="firstName">First Name: </label><input type="text" name="firstName"><br/>
    </div>
    <div class="form-group">
    <label for="lastName">Last Name: </label><input type="text" name="lastName"><br/>
    </div>
    <div class="form-group"?>
    <label for="age">Age: </label><input type="text" name="age"><br/>
    </div>

    <input type="submit" value="Add User" class="btn btn-primary">
    </form>
    </div>
    <br/>
    <a href="index.html">Home</a>
</body>
</html>