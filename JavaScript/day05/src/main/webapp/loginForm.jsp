<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 페이지</title>
</head>
<body>
	<fieldset>
		<legend>로그인</legend>
		<form action="Login.jsp" method="post">
			<input type="text" name="id" placeholder="아이디 입력">
			<input type="text" name="password" placeholder="비밀번호 입력">
			<input type="submit" value="로그인">
			</form>
	</fieldset>
</body>
</html>