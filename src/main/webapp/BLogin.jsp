<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login</h2>


	<%
		//login -> login:set , logout:login:remove 
	
		Cookie c[] = request.getCookies();//get all cookies from browser
		
		for(int i=0;i<c.length;i++){
			if(c[i].getName().equals("login")){
				//redirect to Home 
			}
		}
	
	%>

	<form action="BLoginServlet" method="post">

		Email:<input type="text" name="email" /><Br>
		<br> Password: <input type="text" name="password" /><Br>
		<br> <input type="submit" value="Signup" />
	</form>
</body>
</html>