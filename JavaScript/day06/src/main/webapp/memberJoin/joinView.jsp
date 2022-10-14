<%@page import="java.util.ArrayList"%>
<%@page import="com.member.beans.MemberBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ml" class="com.member.beans.memberManager" scope="application"/>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보</title>
	<style>
		tr{border:1px solid gray; width:100px; text-align: center}
		td{border:1px solid gray; width:100px; text-align: center}
	</style>
</head>
<body>
		
	<!-- request 객체에 저장된 값을 getProperty 액션태그 이용해서 가져오기 -->
	<jsp:useBean id="member" class="com.member.beans.MemberBeans" scope="session"/>
	
	<table >
		<tr>
			<th colspan="2"><h3>회원가입 결과</h3></th>
		</tr>
		<tr>
			<td>아이디</td>
			<td><jsp:getProperty property="id" name="member"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><jsp:getProperty property="pwd" name="member"/></td>
		</tr>
		<tr>
			<td>이름</td><td>
			<jsp:getProperty property="name" name="member"/></td>
		</tr>
	</table>
	<hr>
	
	<table >
		<tr>
			<th colspan="2"><h3>회원가입 리스트</h3></th>
		</tr>
		<tr>
			<% 
				ArrayList<MemberBeans> mmb = ml.getList();
				for(int n=0; n< mmb.size(); n++){
					MemberBeans mb = mmb.get(n);
			%>
			<td>아이디</td>
			<td><%= mb.getId() %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= mb.getPwd() %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= mb.getName() %></td>
		</tr>
		
	<%} %>
	</table>
	
</body>
	
</html>