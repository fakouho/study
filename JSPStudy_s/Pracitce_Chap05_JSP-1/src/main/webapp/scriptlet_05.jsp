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
	<%--<%! <- 는 전역에서 사용하겠다는 의미로 정의 --%>
	<%!public int sum(){
			int total = 0;
			for(int i = 1; i<=100; i++){
				total +=i;
			}
			return total;
	}
	%>
	<h2><%=sum()%>입니다.</h2>
	<br/>
	<h2><%=sum()*3%></h2>
	
	
</body>
</html>