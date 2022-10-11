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
		border:1px solid gray" 
		align='center'>
<%
	// String id = request.getParameter("id");
	//내가 정보를 추가했기 때문에 getAttribute를 사용함.
	String name = (String) request.getAttribute("name");
	//그냥 넘어온 정보를 받으려면 getParameter를 사용하면 됨.
	String id = (String) request.getParameter("id");
%>
<h3>첫번째 액션 페이지입니다.</h3>
[<%=name%>]님 반갑습니다.

<a href="javascript:history.back();">로그아웃</a>
<br>
<p> <img src="./images/cat.png" style="width: 500px; height: 300px"></p>
<hr>
<a href = "secondAction_ex9.jsp"> 두 번째 페이지로 이동</a><br>

<hr>
<%@ include file="todayPrint_ex6.jsp" %><br>
</div>

</body>
</html>