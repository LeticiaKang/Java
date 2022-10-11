<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="width: 600px; height: 500px; 
	border: 1px solid gray; text-align: center">
<h2>첫 번째 페이지입니다.</h2>
내용이 들어가는 곳
<!-- <br><img src="C:\Users\user\Desktop\가을.png">  -->
<br><img src="./images/cat.png" 
		style="width: 400px; height: 400px">
<hr>

<a href = "secondPage_ex8.jsp"> 두 번째 페이지로 이동</a>
<br>
<hr>
<%@ include file="todayPrint_ex6.jsp" %>
<hr>

</div>

</body>
</html>