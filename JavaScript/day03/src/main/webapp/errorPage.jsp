<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=
	exception.getMessage()
%>
<%=	"잠시 기다려주세요."%>
<br>
<%=	"문의 : 010-1234-1234"%>
</body>
</html>