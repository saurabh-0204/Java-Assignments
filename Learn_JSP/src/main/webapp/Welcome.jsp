<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Students</h1>
	This is simple text
	</br>
	<!--  This is HTML comment -->
	<%-- JSP Comment --%>
	<%
	int n = 0;
	n++;
	out.print("Value of Data " + n);
	%>
	</br>

	<%=Calendar.getInstance().getTime()%>
	<br />

	<!-- Declaration -->
	<%! int num=14; %>
	<%= "Number : "+ ++num  %>
</body>
</html>