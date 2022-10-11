<%
//1. url만 가지고 접속시도하는 경우 로그인 페이지로 이동
// *"잘못된 접근입니다."알림창 만들어보기
String memberId = (String)session.getAttribute("memberId");
if(memberId == null){
	response.sendRedirect("login.jsp");
	}
%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 성공 2페이지</title>
	<style>
		div{width: 500px; height: 300px; border: 1px solid gray; text-align: center}
		table{margin: auto; align-items: center; border:1px solid; border-color: blue}
		td, tr{width:150px; height: 30px; border:1px solid gray;}
	</style>
</head>
<body>
	<%
		long presentTime = session.getCreationTime()/1000;
		long lastTime = session.getLastAccessedTime()/1000;
		
		//세션 유지된 시간 : 세션 시작 시간 - 현재시간
		long stayTime = lastTime - presentTime;
	%>
<div>
	<h2><%= memberId %>님 환영합니다!</h2>
	<table>
		<tr>
			<td>오늘 날짜</td><td><jsp:include page = "todayPrint_ex6.jsp" /></td>
		</tr>
		<tr>
			<td>아이디</td><td><%=memberId%></td>
		</tr>
		<tr>
			<td>접속시간</td><td><%=stayTime%>초</td>
		</tr>
		<tr>
			<td colspan="2"><a href="logout.jsp">로그아웃</a></td>
		</tr>
		<tr>
			<td colspan="2"><a href="firstAction_ex9.jsp">첫 번째 페이지로!</a></td>
		</tr>
	</table>
	<h4>- 2페이지 -</h4>
</div>
</body>
</html>