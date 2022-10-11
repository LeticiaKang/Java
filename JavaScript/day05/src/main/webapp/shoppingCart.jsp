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
	//0. 가져올 데이터 인코딩 설덩
	request.setCharacterEncoding("UTF-8");
	//1. 쇼핑 목록 생성 후 구현
	//1-1. 데이터 가져오기(여러개)
	String [] books = request.getParameterValues("book");
	//2. 쿠키 생성
	Cookie [] cookies = new Cookie[books.length];
	for(int i =0; i < books.length; i++){
		//2-1.가져온 데이터 쌍으로 만들기
		cookies[i] = new Cookie("book" + i, books[i]);
		//2-2. 유효기간 설정
		cookies[i].setMaxAge(30*60);
		//2-3.response 객체에 담기
		response.addCookie(cookies[i]);
	}
	
	response.sendRedirect("shoppingBook.jsp");
	
	%>
</body>
</html>