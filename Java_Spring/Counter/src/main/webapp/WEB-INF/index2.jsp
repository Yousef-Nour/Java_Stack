<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
<center >
<h1 style="background-color: red;">
<c:out value="${count}" ></c:out>
</h1>
<a style="display:block;" href="/your_server">Go Back</a>
</center>


</body>
</html>