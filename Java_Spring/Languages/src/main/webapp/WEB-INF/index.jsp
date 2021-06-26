<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Languages</title>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<link rel="stylesheet" type="text/css" href="css/index.css">
	
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
	
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${languages}" var="language">
				<tr>
					<td><a href="/languages/${language.id}">${language.name}</a></td>
					<td>${language.creator}</td>
					<td>${language.currentVersion}</td>
					<td><a href="/languages/delete/${language.id}">delete</a> <a href="/languages/edit/${language.id}">edit</a></td>
					
	
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<main>
		<form:form action="/languages" method="post" modelAttribute="language">
		    
		        <form:label path="name" class="form-label">Name</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    
		    
		        <form:label path="creator" class="form-label">Creator</form:label>
		        <form:errors path="creator"/>
		        <form:input path="creator"/>
		   
		  
		        <form:label path="currentVersion">Current Version</form:label>
		        <form:errors path="currentVersion"/>
		        <form:input path="currentVersion"/>
		 
		    <input id="submit" type="submit" value="Submit"/>
		</form:form>  
	</main>
</body>
</html>