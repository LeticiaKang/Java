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


<div style="width: 600px; height: 500px; 
	border: 1px solid gray; text-align: center">
<h2> 두 번째 페이지 입니다.</h2>
<!-- <br><img src="C:\Users\user\Desktop\가을.png">  -->
<br><img src="./images/가을.png" 
		style="width: 400px; height: 400px">
<hr>
<a href = "firstAction_ex9.jsp"> 첫 번째 페이지로 이동 </a>
<br>

<hr>
<jsp:include page = "todayPrint_ex6.jsp" />
<hr>

</div>
</body>
</html>