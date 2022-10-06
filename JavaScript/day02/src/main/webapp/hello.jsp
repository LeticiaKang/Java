<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 구성요소 연습</title>
</head>
<body>

<%= "Hello JSP!!" %><br>
<%
//스크립트릿(scriptlet) 자바코드를 삽입함
// 1. 여기선 코드자체를 내부에서 선언함
	int num1 = 10;
	int num2 = 20;
	int num3 = 30;
	out.print(num1 + "+" + num2 + "+" + num3 + "=" + (num1+num2+num3) );
	out.print("<br>");
//스크립트릿(scriptlet) 자바코드를 삽입함
// 2. 클라이언트에게 값 받아오기
	int n1 = Integer.parseInt(request.getParameter("n1"));
	int n2 = Integer.parseInt(request.getParameter("n2"));
	out.print(n1 + "+" + n2 + "=" + (n1+n2));
%>

</body>
</html>