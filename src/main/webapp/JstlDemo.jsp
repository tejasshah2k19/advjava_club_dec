<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		int a = 10; 
		String names [] = {"Ram","Shyam","Ganshyam","RadheShyam"};
	%>
	
	<%=a %>
	
	<%
		for(int i=0;i<names.length;i++){
			out.print(names[i]+"<BR>");
		}
	%>
	
	
	<hr> 
	
	<c:set var="x" value="10"></c:set>
	<c:out value="${x}"></c:out>


	<c:set var="myValue" value="Ram,Shyam,Ganshyam,RadheShyam"></c:set>
 	
 	<c:forTokens items="${myValue}" delims="," var="name">
 		${name }<br>
 	</c:forTokens>
 
 
 
 
</body>
</html>