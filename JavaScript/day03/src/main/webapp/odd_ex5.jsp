<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>두 수의 합에 대해 홀짝 여부 확인하기</h3>


<%
	//out.print("<h3>선언문과 스크립트 위치를 바꿔도 가능한가?</h3>");
	//1. 필드 선언
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	//int num1 = 10;
	//int num2 = 31;
	
	int sum = num1 + num2;
	boolean result = odd(sum);
	
	if(result){
		out.print(num1 + "+" + num2 + " 결과는 홀수입니다.");
	}else{
		out.print(num1 + "+" + num2 + " 결과는 짝수입니다.");
	}
%>
<%!
	//2. 메소드 작성
	boolean odd(int data){
		if(data%2 == 0) return false;
		else return true;
}
%>
</body>
</html>