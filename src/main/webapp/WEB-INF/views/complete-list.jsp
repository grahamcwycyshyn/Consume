<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Completes</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" /> 
<link href="/style.css" rel="stylesheet" />
</head>
<body>
	<table class="table">
	<thead>
		<tr>
			<th>Name</th><th>Innovation</th><th>Year</th>
		</tr>
	</thead>
		<c:forEach items="${ completes }" var="complete">
		<tr>
			<td>Name: ${ complete.firstName } ${ complete.lastName }</td>
			<td>Invented: ${ complete.innovation }</td>
			<td>Year: ${ complete.year }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="/">See Tiny List</a>
</body>
</html>