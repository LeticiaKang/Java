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
	//1.쿠키 저장할 배열 만들기(id, name, age)
	Cookie [] cookies = new Cookie[3];
	String [] name = {"id", "name", "age"};
	String [] value = {"smart", "홍길동", "22"};
	
	//2. 쿠키 생성하면서 배열에 저장
	for(int i  = 0; i < cookies.length ; i++){
		//2-1. 쌍으로 만들기
		cookies[i] = new Cookie(name[i], value[i]);
		
		//3. 쿠키정보 유지하는 시간 생성
		cookies[i].setMaxAge(60*30);
		
		//2.클라이언트에 쿠키 전송(response객체에 담기)
		response.addCookie(cookies[i]);
	}
	
%>
</body>
</html>