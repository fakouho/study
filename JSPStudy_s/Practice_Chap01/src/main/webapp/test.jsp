 <%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>ㅏ
<meta charset="UTF-8">
<title>Insert title here</title>
	<%
		Calendar calender = Calendar.getInstance(); 
		int hour = calender.get(Calendar.HOUR_OF_DAY);
		int minut = calender.get(Calendar.MINUTE);
		int second = calender.get(Calendar.SECOND);
	%>
		
</head>
<body>
	<h1>안녕하게요 JSP테스트 페이지입니다</h1>
	<h1>
		현재시간 : <%=hour %>시 <%=minut %>분 <%=second %>초
	</h1>
	
</body>
</html>