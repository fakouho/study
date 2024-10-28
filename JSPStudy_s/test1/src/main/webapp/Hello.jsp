<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		안녕하게요
	</h2>
	<%
	int n = 1;
	int n2 = 2;
	%>
	
	<%= n %><br>
	<%= n2 %>
	
	<%!public int add(int a, int b){
		return a+ b;
	}%>
	<br>
	<%=add(n,n2) %>
</body>
</html>