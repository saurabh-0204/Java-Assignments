<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cor"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Factor of the number ${number }</h1>
	<ul>
		<cor:forEach var="fact" items="${list}">
			<li>${fact}</li>
		</cor:forEach>
	</ul>
</body>
</html>