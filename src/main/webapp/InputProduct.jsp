<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Input Product</h2>
	
	
	<form action="CalculatePriceServlet" method="post">
		ProductName :	<input type="text" name="productName"/>
		${productNameError }
		<br><br>  
		Price : 	<input type="text" name="price"/>
		${priceError}
		<br><br>
		DiscountPrice: 	<input type="text" name="discountPrice"/><br><br>
		Tax(%): 	<input type="text" name="tax"/><br><br>
	
		<input type="submit" value="Calculate Price"/>
		
	</form>
	
</body>
</html>