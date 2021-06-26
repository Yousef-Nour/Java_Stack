<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/dashboard.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<a href="/dashboard">Dashboard</a>
	</header>
	<main>
		${song.title}
		${song.artist}
		${song.rating}
	</main>
	<footer>
		<a href="#" >Delete</a>
	</footer>
</body>
</html>