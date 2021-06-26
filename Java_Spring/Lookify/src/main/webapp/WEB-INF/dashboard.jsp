<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/dashboard.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta charset="ISO-8859-1">
<title>Lookify!</title>
</head>
<body>
	<header>
	<div><a href="/songs/new">Add New</a></div>
	<div><a href="#">Top Songs</a></div>
	
	<form method="GET" action="/search">
		 	<input name="q" type="text">
		 	<input type="submit" value="Search Artist">
		 </form>
	</header>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="#"> <c:out value="${song.title }"></c:out></a></td>
					<td><c:out value="${song.rating}" /></td>
					<td><a href="/songs/delete/${song.id}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>