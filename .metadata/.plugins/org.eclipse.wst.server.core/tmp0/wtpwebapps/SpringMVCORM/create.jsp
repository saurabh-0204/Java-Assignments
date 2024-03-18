<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<frm:form action="save" modelAttribute="save">
Enter name : 
		<frm:input path="fname" />
		<br />
		Enter lname :
		<frm:input path="lname" />
		<br />
		Enter uid : 
		<frm:input path="uid" />
		<br />
		Enter password :
		<frm:input path="password" />
		<br />
		Enter email : 
		<frm:input path="email" />
		<br />
		Enter contactno :
		<frm:input path="contactno"  maxlength="10"/>
		<br />
		<input type="submit" value="Create New" />
	</frm:form>


</body>
</html>