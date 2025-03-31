<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	 
	while(rs.next()){//1st record 2nd  false  
		String movieName = rs.getString("movieName");
		out.print(movieName+"<br>");
	}
	
	%>



</body>
</html>