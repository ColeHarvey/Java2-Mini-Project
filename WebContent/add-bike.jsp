<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bike</title>
</head>
<body>
    <div class="container">
    <h2>Add a Bike to our Bike list</h2>
    <form action="addBikeServlet" method="post">
    <div class="form-group">
    <label for="make">Make: </label><input type="text" name="make"><br/>
    </div>
    <div class="form-group">
    <label for="model">Model: </label><input type="text" name="model"><br/>
    </div>
    <div class="form-group"?>
    <label for="year">Year: </label><input type="text" name="year"><br/>
    </div>
        <div class="form-group"?>
    <label for="quality">Quality: </label><input type="text" name="quality"><br/>
    </div>
        <div class="form-group"?>
    <label for="price">Price: </label><input type="text" name="price"><br/>
    </div>

    <input type="submit" value="Add Bike" class="btn btn-primary">
    </form>
    </div>
    <br/>
    <a href="index.html">Home</a>
</body>
</html>