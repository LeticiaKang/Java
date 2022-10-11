<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키 정보 가져오기(조회)</h3>
<%
	//1. request객체이용
	Cookie [] cookies = request.getCookies();
	
	//2. 쿠키 데이터 보여주기
	//2. 쿠키 데이터는 쌍으로 존재함. 형태 : (name, value)
	//2. id : smart 형태로 출력하고 싶음
	for(int i  = 0; i < cookies.length ; i++){
		//2-1. 쿠키의 name정보 가져오기
		String name = cookies[i].getName();
		String value = cookies[i].getValue();
		out.print(name + ": " + value + "<br>");
	}

%>

</body>
</html>