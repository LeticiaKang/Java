<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h3>사이트 방문자 수 출력 : application 객체를 이용</h3>
	<br>
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
	방문자수 : <%= application.getAttribute("visitCnt")%>
	
</body>
</html>