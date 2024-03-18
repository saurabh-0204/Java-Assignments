<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userinfo" class="beans.User" scope="session" />
	<h1>
		Welcome
		<jsp:getProperty name="userinfo" property="fname" />
		<jsp:getProperty name="userinfo" property="lname" />
	</h1>
	</br>
	ID : <jsp:getProperty name="userinfo" property="uid" />
	</br>

	Email : <jsp:getProperty name="userinfo" property="email" />
	</br>

	Age : <jsp:getProperty name="userinfo" property="age" />
	</br>

	Contact : <jsp:getProperty name="userinfo" property="contact" />
	</br>

</body>
</html>