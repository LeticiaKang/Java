<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>책 장바구니</title>
	<style>
		td{text-align: center}
		td, th{border: 1px solid gray; padding:1px; text-align: center;}
		h3{text-align: center}
	</style>
</head>
<body>
	<h3>책 장바구니 쿠키 구현</h3>
	<form action="shoppingCart.jsp" method="post">
		<table style="width:400px; border:1px solid gray">
			<tr>
				<th>책 제목</th>
				<th> 가 격 </th>
				<th>장바구니 담기</th>
			</tr>
			<tr>
				<td>서블릿</td>
				<td>22,000원</td>
				<td><input type="checkbox" name="book" value = "서블릿"></td>
			</tr>
			<tr>
				<td>자바</td>
				<td>24,000원</td>
				<td><input type="checkbox" name="book" value = "자바"></td>
			</tr>
			<tr>
				<td>파이썬</td>
				<td>20,000원</td>
				<td><input type="checkbox" name="book" value = "파이썬"></td>
			</tr>
			<tr>
				<td>머신러닝</td>
				<td>29,000원</td>
				<td><input type="checkbox" name="book" value = "머신러닝"></td>
			</tr>
			<tr>
				<td>영상처리</td>
				<td>30,000원</td>
				<td><input type="checkbox" name="book" value = "영상처리"></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value = "장바구니 담기"></td>
				<br>
			</tr>
		</table>
	</form>
	<br>
	<div style="width:400px; border:1px solid gray; text-align: :center">
		<h3>장바구니 목록</h3>
		<%
			//1. 쿠키 정보 읽기
			int num = 1;
			Cookie [] cookies = request.getCookies();
			System.out.println(cookies.length);
			//2. 쿠키 정보 중에 이름이 book~인 것을 찾고 value 출력하기
			for(int i = 0; i<cookies.length; i++){
				String name = cookies[i].getName();
				if(name.contains("book") == true){
					out.print((num) + "." + cookies[i].getValue() + "<br>");	
					num++;
				}
			}
		%>
	</div>
</body>
</html>