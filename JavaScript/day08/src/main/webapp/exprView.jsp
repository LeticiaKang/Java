<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- num1과 num2는 클라이언트에서 온거고 sum은 추가한거라 param을 안붙여
		동일한 변수명인 정보에 대해 어떤건지 모를 때, requestScope.sum으로 구분해서 불러옴
		표현언어의 내장객체로 불러오는 거. 7장 ppt 페이지 10 -->
	${param.num1} + ${param.num2} = ${sum}
</body>
</html>