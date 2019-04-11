<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text-html";charset="UTF-8">
<title>LOGIN</title>
</head>
<body  style="background-color:powderblue;">
	<h1>Login Session</h1>
	<form action="AnotacionServlet" method="post">
		<label>User: </label><input name="user" type="text">
		<label>Password: </label><input name="pass" type="text">
		<input type="submit" value="Login">
	</form>
</body>
</html>