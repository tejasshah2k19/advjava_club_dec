<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


</head>
<body>


This is an HTML code !! 
<bR> 
<Br> 

int j;

j=10;

print j 

<br><br> 
<%
	int j;
	j=101;
	out.println(j);//print

	if(j%2 == 0){
		out.print("EVEN");
	}else{
		out.print("ODD");
	}
%>


<%=j %>


<%! int k=100; %>


<%if(k>100){ %>
	<%=k %>
<%} %>



</body>
</html>