<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="DbAddMovieServlet" method="post">
	
	MovieName: <input type="text" name="movieName"/><Br><br>  
	Category:<input type="text" name="category"/><Br><br>
	Rating:<input type="text" name="rating"/><Br><br>
	Year:<input type="text" name="year"/><Br><br>
	
	<input type="submit" value="Save Movie"/>
	</form>
</body>
</html>