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
//1. 데이터 가져오기
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
/*
//2. 데이터 확인해서 페이지 연결하기
	if (id.equals("smart") && pw.equals("1234")){
		response.sendRedirect("./loginSuccess.jsp?id=" + id);
	}else{
		response.sendRedirect("./loginFail.jsp");
	}
*/

//2-2. request.forward를 이용한 방식 : 아이디가 아닌 이름으로 넘기기
	if (id.equals("smart") && pw.equals("1234")){
		String name = "홍길동";
		
		System.out.println("홍길동");
		//(0)request객체에 하나 더 추가해서 보내는 거
		request.setAttribute("name", name);
		//(1)객체(인스턴스) 생성
//		RequestDispatcher dispatcher = request.getRequestDispatcher("./loginSuccess.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("./firstAction_ex9.jsp");
		//(2)forward메소드 호출
		dispatcher.forward(request, response);

	}else{
		response.sendRedirect("./secondAction_ex9.jsp");
	}
%>
</body>
</html>