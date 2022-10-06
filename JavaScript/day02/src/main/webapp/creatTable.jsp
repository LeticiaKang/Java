<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방이 10개인 table 만들기</title>
</head>
<body>
1. 스크립트릿으로 표현하기
<table border>
<tr>
<%
for(int a=1 ; a<11; a++){
	out.print("<td>" + a + "</td>");
}
%>
</tr>
</table>

<!-- 2. 표현식으로 만들기 -->
<br>
2. 표현식으로 출력
<table border>
<tr>
<% for(int a=1 ; a<11; a++){ %>
	<td><%= a%></td>
<% } %>
</tr>
</table>


</body>
</html>