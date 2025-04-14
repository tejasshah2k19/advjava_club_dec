<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inclusion</title>
</head>
<body>

	<%@ include file="Header.jsp"%>


	<h2>Home</h2>

	<jsp:include page="Footer.jsp" />


	<%=x%>
	<%-- <%=y %>
 --%>
</body>
</html>