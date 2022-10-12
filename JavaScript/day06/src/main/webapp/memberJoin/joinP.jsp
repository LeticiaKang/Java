<%@page import="javax.management.loading.MLet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ml" class="com.member.beans.memberManager" scope="application"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- userBean 이용한 객체 생성과 데이터 저장 
	-> 액션태그는 xml표준에 맞워 작성함-->
	<%
	 request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="member" class="com.member.beans.MemberBeans" scope="session"/>
	<jsp:setProperty property="*" name="member"/>
	
	<a href="joinView.jsp">회원정보 보기</a>
	<p>
	 <%
	 	ml.add(member);
	 %>
</body>
</html>