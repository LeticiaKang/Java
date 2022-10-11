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
//1. 필드선언
	String name = request.getParameter("name");
	int number = Integer.parseInt(request.getParameter("number"));
%>

<table border style="width: 300px; text-align: center">
<caption><%="방 이름 : " + name%></caption>
<tr>
<% 
for(int n=1; n<=number; n++) {
	out.print("<td>" + n + "</td>");	
}
%>
</tr>
</table>

</body>
</html>