<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>시작</title>
</head>
<body>
	<%
		//application 객체 정보를 얻어서 값이 존재하는지 확인하기
		Integer visitCnt = (Integer) application.getAttribute("visitCnt");
	
		if(visitCnt == null){
			//존재하지 않는 경우에 방문자수를 저장할 변;수 생성
			application.setAttribute("visitCnt", 1);
	   }else{
		   if(session.isNew()){
				// 방문자 수 증가 
				visitCnt++;
				// application 객체에 저장
				application.setAttribute("visitCnt", visitCnt);
		   }
	   }
	%> 
	<h3>
		환영합니다~! *^^*
		<br>
		당신은 <%= application.getAttribute("visitCnt")%>번째 방문자입니다.
	</h3>
	<p>
	<button><a href="addr_form.jsp">회원가입</a></button>
	<button><a href="loginForm.jsp">로그인</a></button>

</body>
</html>