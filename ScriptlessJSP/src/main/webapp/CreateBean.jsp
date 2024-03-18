<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
	
	<jsp:useBean id="userinfo" class="beans.User" scope="session" ></jsp:useBean>
	<jsp:setProperty name="userinfo"  property="uid"  param="uid" />
	<jsp:setProperty name="userinfo"  property="password"  param="password" />
	<jsp:setProperty name="userinfo"  property="fname"  param="fname" />
	<jsp:setProperty name="userinfo"  property="lname"  param="lname" />
	<jsp:setProperty name="userinfo"  property="email"  param="email" />
	<jsp:setProperty name="userinfo"  property="contact"  param="contact" />
	<jsp:setProperty name="userinfo"  property="age"  param="age" />
	
	<%-- <jsp:setProperty name="userinfo"  property="*" />       --%>
        <jsp:forward page="/DisplayBean.jsp" />
</body>
</html>