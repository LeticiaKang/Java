<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 폼</h2>
	<form method="post" action="loginService">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" size="20"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd" size="20"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인">
				<input type="reset" value="취소">
				<button><a href ="main.jsp">홈으로</a></button></td>
			</tr>
		</table>
	</form>
</body>
</html>