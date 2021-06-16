<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
</head>
<body>

<form action="/code" method="POST">
<input type="text" name="password" placeholder="Guess the word">
<input type="submit" value="Try Code">
</form>
<c:out value="${error }"></c:out>

</body>
</html>