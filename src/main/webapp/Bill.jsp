<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	ProductName : <%=request.getAttribute("productName") %><br>
	Price : <%=request.getAttribute("price") %>  <br>
	Discount :  <%=request.getAttribute("discountPrice") %><Br>
	Tax :   <%=request.getAttribute("tax")%>% <Br>
	Tax Price :<%=request.getAttribute("taxPrice") %> <Br> 
	Payable : <%=request.getAttribute("payable") %><br> 
	
</body>
</html>