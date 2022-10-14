<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = num1 + num2;
	%>
	(표현식)<br>
	두 수의 합 : <%= sum %><br>
	<br>
	(param 안함)<br>
	두 수의 합 : ${num1}<br>
	<br>
	(param으로 가져옴)<br>
	두 수의 합 ${param.num1 + param.num2} 
</body>
</html>