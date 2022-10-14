<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="ViewAllService">
		<%
			MemberVO member = (MemberVO) session.getAttribute("member");
			String name = member.getName();
		%>
		
		<h3><%= name %>님 환영합니다.</h3>
		<br>
		<a href="allMember.">회원정보 보기</a>
		<a href="main.jsp">로그아웃</a>
	</form>
</body>
</html>