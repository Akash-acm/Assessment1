<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My form</title>
</head>
<body>
	<form action="demo" method="POST"> <!-- http://localhost:8080/servlet-app/demo -->
	<span>EmpID</span><input type="text" name="id"><br /> 
		<span>Name</span><input type="text" name="name"><br /> 
		<span>City</span><input type="text" name="city"><br /> 
		<span>Salary</span><input type="text" name="salary"><br /> 
		<input type="submit" value="Send"><br />
	</form>
	
</body>
</html>