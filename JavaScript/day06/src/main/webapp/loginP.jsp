<%@page import="com.addr.app.AddrBean"%>
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
	
	//Member 객체 생성하고 데이터 저장
	AddrBean user = new AddrBean();

	//전송된 로그인 정보 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	session.setAttribute("id", id);
	session.setAttribute("pwd", pwd);
	
	//id,pwd 맞는지 확인하기
	String name = user.getUsername();
	System.out.println(name);
	if(name != null){
		session.setAttribute("name", name);
		response.sendRedirect("loginView.jsp");
	}else{
		response.sendRedirect("main.jsp");
	}
	
	%>

 
</body>
</html>