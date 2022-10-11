<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>절대값 계산 메소드 선언</h3>
<%!
	int abs(int num){
		if(num > 0)return num;
		else return -num;
		
	}
%>
<h3>생성한 메소드 호출하기</h3>
<%
	int data1 = 5;
	int result1 = abs(data1);
	out.print("5의 절대값 : " + result1);
%>
<br>
<%	
	int data2 = -2;
	int result2 = abs(data2);
	out.print("-2의 절대값 : " + result2);
	
%>


</body>
</html>