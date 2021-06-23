<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/login" method="POST">
	Email<input type="email" name="email" placeholder="email@somthing.com">
	Password<input type="password" name="password" placeholder="password">
	<button type="submit">Login</button>
</form>

</body>
</html>