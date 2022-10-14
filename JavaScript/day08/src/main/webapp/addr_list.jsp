<%@page import="java.util.List"%>
<%@page import="beans.AddrBean"%>
<%@page import="beans.AddrManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="beans.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<fmt:requestEncoding value="UTF-8"/>
<!DOCTYPE html>
<jsp:useBean id="am" class="beans.AddrManager" scope="application"/>
<jsp:useBean id="sess" class="beans.AddrBean" scope="session"/>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>주소록 목록</title>
</head>
<body>
<div align=center>
	<H2>주소록</H2>
	<HR>
	<a href="addr_form.html">주소추가</a><P>
	<table border=1 width=500>
		<tr>
			<td>이름</td><td>전화번호</td><td>이메일</td><td>성별</td>
		</tr>
			<%
				//AddrManager am = new AddrManager();
				//List<AddrBean> aaa =  am.getAddrList();
				//session.setAttribute("aaa", aaa);
			%>
			<!-- c:forEach var="user" items="${aaa}" -->
			<c:forEach var="user" items="${am.getAddrList()}">
			<tr >
				<td> ${user.getUsername()} </td>
				<td> ${user.tel}  </td>
				<td> ${user.email}  </td>
				<td> ${user.gender}  </td>
			</tr>
			</c:forEach>
	</table>
</div>
</body>
</html>


