<%@page import="java.util.List"%>
<%@page import="com.addr.app.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 성공</title>
	<style>
		tr{border:1px solid gray; width:100px; text-align: center}
		td{border:1px solid gray; width:100px; text-align: center}
	</style>
</head>
<body>
	<!-- request 객체에 저장된 값을 getProperty 액션태그 이용해서 가져오기 -->
	<jsp:useBean id="adm" class="com.addr.app.AddrManager" scope="request"/>
	<jsp:useBean id="user" class="com.addr.app.AddrBean" scope="request"/>
	<div>
	<h3><%= session.getAttribute("name") %>님 환영합니다!!</h3>
	</div>
	<table >
		<tr>
			<td colspan="2"><h3>동호회 회원 현황</h3></td>
		</tr>
			<% 
				List<AddrBean> userList = adm.getAddrList();
				for(int n=0; n< userList.size(); n++){
					AddrBean us = userList.get(n);
			%>
		<tr>
			<td>이름</td>
			<td><%= us.getUsername()%></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><%= us.getTel() %></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%= us.getGender() %></td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>