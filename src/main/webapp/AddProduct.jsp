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
	String error = (String) request.getAttribute("error");
	%>

	<h2>Add Product</h2>

	<form action="AddProductServlet" method="post">
		ProductName: <input type="text" name="productName" /><br>
		<br> Price : <input type="text" name="price" /><br>
		<br> Qty : <input type="text" name="qty" /><br>
		<br> <input type="submit" value="Add Product" />

	</form>
	<br>
	<%=error==null?"":error%>

</body>
</html>