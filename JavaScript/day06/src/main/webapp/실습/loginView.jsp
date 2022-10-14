<%@page import="com.addr.app.AddrBean"%>
<%@page import="java.util.List"%>
<%@page import="com.addr.app.AddrManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="manager" class="com.addr.app.AddrManager" scope="application"/>
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
	<jsp:useBean id="user" class="com.addr.app.AddrBean" scope="session"/>
	<div>
	<h3><%= user.getUsername() %>님 환영합니다!!</h3>
	</div>
	<table >
		<tr>
			<td colspan="3"><h3>동호회 회원 현황</h3></td>
		</tr>
		<tr>
			<td>이름</td>
			<td>성별</td>
			<td style="width:150px">전화번호</td>
		</tr>
			<%
				for(AddrBean bean : manager.getAddrList()) {
			%>
			<% 
				//List<AddrBean> userList = manager.getAddrList();
				//for(int n=0; n< userList.size(); n++){
				//	AddrBean addrBean = userList.get(n);
			%>
		<tr>
			<td><%= bean.getUsername()%></td>
			<td><%= bean.getGender() %></td>
			<td style="width: 100px"><%= bean.getTel() %></td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>