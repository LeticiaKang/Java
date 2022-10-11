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
	String web = request.getParameter("web");
	
	if(web.equals("다음")){
		response.sendRedirect("http://www.daum.net");
	}else if(web.equals("네이버")){
		response.sendRedirect("http://www.naver.com");
	}else {
		response.sendRedirect("http://www.google.com");
	}
	
%>

</body>
</html>