<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문,표현식</title>
</head>
<body>
	<%!
		int i= 10;
		String str = "강우석";
		
		public int add(int x, int y){
			return x*y;
		}
	%>
	
	<%=i+"<br/>"%>
	<%=str+"<br/>" %>
	<%=add(10,35) %>
	
</body>
</html>