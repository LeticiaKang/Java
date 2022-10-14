<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<H2>주소록 등록</H2>
	<form name=form1 method="post" action=addr_add.jsp>
		<table border=1 cellspacing="1" cellpadding="5">
			<tr>
				<td>아이디</td>
				<td><input type=text size=20 name=id></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type=text size=20 name=pwd></td>
			</tr>
			<tr>
				<td>이 름</td>
				<td><input type=text size=20 name=username></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type=text size=20 name=tel></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type=text size=20 name=email></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
				<select name=gender >
					<option selected>남</option>
					<option>여</option>
				</select>
			</td>
			</tr>
		<tr><td colspan=2 align=center>
			<input type=hidden value="0" name=grade>
			<input type=submit value="확인">
			<button><a href="main.jsp">취소</a></button></td></tr>
	</table>
	
	</form>
</body>
</html>