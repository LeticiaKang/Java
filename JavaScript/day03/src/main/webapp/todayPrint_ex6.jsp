<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  <h3>오늘 날짜는?</h3>  -->
<%
	Calendar cal =  Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DATE);
	out.print("오늘은 " + year +"년 "+ (month+1) +"월 "+ day +"일 입니다.");
%>

</body>
</html>