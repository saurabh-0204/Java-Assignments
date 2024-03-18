<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CreateBean.jsp" method="post">
		User Id: <input type=text name="uid" required></br> 
		Password : <input type="password" name="password" required /></br> 
			First Name : <input type="text" name="fname" required /></br> 
			Last Name : <input type="text"name="lname" required /></br>
			 Email : <input type="email" name="email"required /></br> 
			  Contact: <input type="text" name="contact" required /></br>
			 Age : <input type="text" name="age" required /></br>
			   <input type="submit" value="Register" />
	</form>
</body>
</html>