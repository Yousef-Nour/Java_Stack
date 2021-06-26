<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta charset="ISO-8859-1">
<title>${language.name}</title>
</head>
<body>
	<header>
		<a href="/languages" style="float: right;">dashboard</a>
	</header>
	<main>
		<p>${language.name}</p>
		<p>${language.creator}</p>
		<p>${language.currentVersion}</p>
		<p><a href="/languages/edit/${language.id}">Edit</a></p>
		<p><a href="/languages/delete/${language.id}">Delete</a></p>
	</main>
</body>
</html>
