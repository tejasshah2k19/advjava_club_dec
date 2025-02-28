<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Signup</h2>


<form action="BSignupServlet" method="post">
	FirstName: <input type="text" name="firstName"/><Br><br>
	Email:<input type="text" name="email"/><Br><br>
	Password: <input type="text" name="password"/><Br><br>

	<input type="submit" value="Signup"/>
</form>


</body>
</html>