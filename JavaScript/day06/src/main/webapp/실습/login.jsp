<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="width:200px; margin: auto; text-align: center">
		<legend>로그인</legend>
		<p>
		<form action="login_form.jsp" method="post">
			<p>
			<input type="text" name="id" placeholder="아이디">
			<br>
			<input type="password" name="pwd" placeholder="비밀번호">
			<p>
			<input type="submit" value="로그인">
			<input type="reset" value="초기화">
		</form>
</body>
</html>