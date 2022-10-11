<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 확인 과정</title>
</head>
<body>
	<%
	//1. 데이터 가져오기
	//1-1. sql로 가져온 데이터 저장
		String memberId = "smart";
		String memberPwd = "1234";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pw");
	
	//2. 회원이 동일한지 확인하기
		//2-1. 회원이라면 1번째 액션으로 이동하기
		if (id.equals(memberId) && pwd.equals(memberPwd)){
			//(1) 정보를 그대로 유지하기 위해 session 사용
			session.setAttribute("memberId", memberId);
			session.setAttribute("memberPwd", memberPwd);
			//(2) 세션 시작 시간 "sst"라는 변수에 저장
			long sessionStartTime = session.getCreationTime()/1000/60;
			session.setAttribute("sst", sessionStartTime);
			// (3) 성공시 이동하는 페이지 응답 코드
			response.sendRedirect("firstAction_ex9.jsp");
		}
		//2-2. 회원 아니라면 로그인 페이지로 보내기 
		else{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>