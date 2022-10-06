<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1부터 100까지 합 구하기</title>
</head>
<body>
<%
	int result = 0;
	for(int i=1; i<101; i++){
		result += i;
	}
	out.print("1부터 100까지 합은 " + result + "입니다.");
%>
</body>
</html>