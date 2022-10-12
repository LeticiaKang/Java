<%@page import="beans.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보</title>
	<style>
		tr{border:1px solid gray; width:100px; text-align: center}
		td{border:1px solid gray; width:100px; text-align: center}
	</style>
</head>
<body>
	<%
	//Member member = (Member) request.getAttribute("member");
	
	%>
	<!-- request 객체에 저장된 값을 getProperty 액션태그 이용해서 가져오기 -->
	<jsp:useBean id="member" class="beans.Member" scope="request"/>
	
	<table >
		<tr>
			<td colspan="2"><h3>회원정보</h3></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%= session.getAttribute("id") %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= session.getAttribute("pwd") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= session.getAttribute("name") %></td>
		</tr>
	</table>
	
</body>
</html>