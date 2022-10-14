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
	//request 객체에서 데이터 분리/가져오기
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	
/*	//Member 객체 생성하고 데이터 저장
	Member member = new Member();
	member.setId(id);
	member.setPwd(pwd);
	member.setName(name);
    request.setAttribute("member", member);
*/	%>

	<jsp:useBean id="member" class="com.member.beans.MemberBeans" scope="request"/>
<!--	<jsp:setProperty property="*" name="member"/> -->
	<jsp:setProperty property="id" name="member"/>
	<jsp:setProperty property="pwd" name="member"/>
<!--	<jsp:setProperty property="name" name="member"/> -->
	
	<%
	RequestDispatcher dispt= request.getRequestDispatcher("joinView.jsp");
	dispt.forward(request, response);

	%>

<!--  결과값이 나오는 페이지가 의미 없기 때문에 주석처리 --> 
	<table >
		<tr>
			<td colspan="2"><h3>회원가입 결과</h3></td>
		</tr>
		<tr>
			<td>아이디</td><td><%= member.getId() %> %>%></td>
		</tr>
		<tr>
			<td>비밀번호</td><td><%= member.getPwd()%></td>
		</tr>
		<tr>
			<td>이름</td><td><%= member.getName()%></td>
		</tr>
	</table>

 
</body>
</html>