<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		<input type="text" name="email" placeholder="Enter username" />
		<br>
		<br>
		<input type="password" name="password" placeholder="Enter Password" />
		<br>
		<br>
		<button type="submit">Login</button>
	</form>
	<a href="Registration.jsp" >Register</a>
</body>
</html>