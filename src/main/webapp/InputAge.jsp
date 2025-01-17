<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age</title>
</head>
<body>

	<%
	String birthYearError = (String)request.getAttribute("birthYearError");
	%>
	<form action="CalculateAgeServlet" method="post">
		Age : <input type="text" name="age" /><br> <br> <input
			type="submit" value="Submit" />
			
	</form>
	<br>
	<%=birthYearError %>


</body>
</html>