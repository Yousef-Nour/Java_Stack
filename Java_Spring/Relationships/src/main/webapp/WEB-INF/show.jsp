<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<h1>${personInfo.firstName}${personInfo.lastName}</h1>
	<main>
		<h3>License Number: ${personInfo.license.number}</h3>
		<h3>State: ${personInfo.license.state}</h3>
		<h3>Expiration Date: ${personInfo.license.expirationDate}</h3>
	</main>

</body>
</html>