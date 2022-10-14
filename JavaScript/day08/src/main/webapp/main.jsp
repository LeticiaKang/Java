<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.do' />
</c:if>
<!DOCTYPE
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
	<c:choose>
		<!-- 일반회원인 경우 -->
		<c:when test="${mVo.admin==0}">
			<h2>회원 전용 페이지</h2>
			<form action="logout.do">
				<table>
					<tr>
						<td>안녕하세요. ${loginUser.name}(${loginUser.userid})님</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="로그아웃"> &nbsp;&nbsp; 
							<input type="button"
							value="회원정보변경"
							onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
							<input type="button" value="탈퇴하기"
							onclick="location.href='memberDelete.do?userid=${loginUser.userid}'">  
						</td>
					</tr>
				</table>
			</form>
		</c:when>	
		
		<!-- 관리자인 경우 -->
		<c:otherwise>	
			<h2>관리자 전용 페이지</h2>			
			<form action="logout.do">
				<input type="radio" name="admin" value="0" checked="checked"> 일반회원
				<input type="radio" name="admin" value="1"> 관리자


				<input type="radio" name="admin" value="0"> 일반회원
				<input type="radio" name="admin" value="1" checked="checked"> 관리자
			</form>
		</c:otherwise>
	</c:choose>
	
</body>
</html>