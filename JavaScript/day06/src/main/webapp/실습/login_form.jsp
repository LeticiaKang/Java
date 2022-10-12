<%@page import="com.addr.app.AddrBean"%>
<jsp:useBean id="adm" class="com.addr.app.AddrManager" scope="session"/>
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
	
	//AddrBean 객체 생성하고 데이터 저장
	AddrBean user = new AddrBean();

	//전송된 로그인 정보 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = null;
	session.setAttribute("id", id);
	session.setAttribute("pwd", pwd);
	
	//id,pwd 맞는지 확인하고 회원 이름 가져오기
	if(adm.CheckUser(id, pwd)) name = user.getUsername();
	// 맞다면 이름 출력
	System.out.println(name);
	// 맞으면 000님 환영합니다 페이지로 가고, 틀리면 main페이지로 가기
	if(name != null){
		session.setAttribute("name", name);
		response.sendRedirect("loginView.jsp");
	}else{
		response.sendRedirect("main.jsp");
	}
	
	%>

 
</body>
</html>