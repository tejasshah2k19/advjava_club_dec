<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Home</h2>

	<%
	String email = (String) session.getAttribute("email");
	%>
	
	email =>	<%=email %><br> 

	<br>
	
	${email }<br>
	${sessionScope.email }<br>
	<br>
	<a href="LogutServlet">Logout</a>
	
	
</body>
</html>