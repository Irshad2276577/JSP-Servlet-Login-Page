<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Registration </h1>
  <form action="register" method="post">
	<input type="text" name="name" placeholder="name"/>
		<br>
		<br>
	<input type="text" name="email" placeholder="email"/>
	<br />
	<br>
	<input type="password" name="password" placeholder="Password"/>
	<br />
	<br>
	<button type="submit">Register</button>
  </form>
  <a href="Login.jsp" >Login</a>
</body>
</html>