<%
String userId = (String)session.getAttribute("userId");
if(userId == null){
		response.sendRedirect("loginForm.jsp");
	}	
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 성공 후 2페이지</title>
</head>
<body>
	<h2>2페이지</h2>
	<%= userId %>님 환영합니다.
	<a href="logout.jsp">로그아웃</a>
	<hr>
	세션 시작 시간 : <%=session.getAttribute("sst") %>분
	<hr>
	세션 시작 다시 호출 : 
	<%
		long presentTime = session.getCreationTime()/1000;
		long lastTime = session.getLastAccessedTime()/1000;
		
		//세션 유지된 시간 : 세션 시작 시간 - 현재시간
		long stayTime = lastTime - presentTime;
		out.print("머문 시간 : " + stayTime + "초");
	%>
	<hr>
	<a href="page1.jsp">1페이지로 이동</a>
</body>
</html>