
<%@page import="com.addr.app.AddrManager"%>
<%@page import="com.addr.app.AddrBean"%>
<jsp:useBean id="manager" class="com.addr.app.AddrManager" scope="application"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<%
	//request 객체에서 데이터 분리/가져오기
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("id");
	String userPwd = request.getParameter("pwd");
	if(userId == null || userPwd == null) response.sendRedirect("main.jsp");
	%>
	<!-- 전송된 로그인 정보 가져오기  -->
	<jsp:useBean id="user" class="com.addr.app.AddrBean" scope="session"/>

	<%
	
	//id,pwd 맞는지 확인하고 회원 이름 가져오기
	//CheckUser에 매개변수를 넣어 확인하는데, 맞으면 true 틀리면 false가 나온다.
	//회원인 경우 name을 화면에 보이고 싶음(예; 00님 환영합니다)
	String name = null; 
	System.out.println(userId + " " + userPwd);
	name = manager.CheckUser(userId, userPwd);
	System.out.println("로긴form 32줄" + name); //확인용
	//회원이면 View로 아니면 main으로 이동
	if(name != null){
		session.setAttribute("name", name);
		response.sendRedirect("loginView.jsp");
		System.out.println("로긴form 37줄" + name); //확인용
	}else {
		response.sendRedirect("main.jsp");
		System.out.println("로긴form 40줄" + name); //확인용
	}
	
	%>
 
</body>
</html>