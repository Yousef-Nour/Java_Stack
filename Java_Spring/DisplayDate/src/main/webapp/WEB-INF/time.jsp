<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <script type="text/javascript" src="js/alertTime.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body>
<center>
<c:out value="${time}"></c:out>
</center>
<a href="/">Go Back</a>

</body>
</html>