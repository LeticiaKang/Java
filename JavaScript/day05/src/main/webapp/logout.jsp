<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그아웃 페이지</title>
</head>
<body>
	<%
		//로그인 후 로그아웃 버튼을 눌렀을 경우
		//session이 그대로 남아있는 것을 방지하기 위해 
		//session을 초기화 해준다.
		session.invalidate();
		response.sendRedirect("loginForm.jsp");
	%>
</body>
</html>