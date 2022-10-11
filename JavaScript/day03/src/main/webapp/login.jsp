<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="width: 250px; height: 150px;
		border:1px solid gray" 
		align='center'>
<h3>로그인</h3>
		
<form action="loginProcess.jsp" method="post">
ID <input type="text" name="id" placeholder="아이디를 입력하세요")><br>
PW <input type="text" name="pw" placeholder="비밀번호를 입력하세요")>

<input type="submit" value="로그인">
</form>
</div>
</body>
</html>