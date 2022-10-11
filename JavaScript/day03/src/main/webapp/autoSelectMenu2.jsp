<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.IssuerSerialNumRequest"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	<title>메뉴 자동 선택하기</title>
</head>
	<body>
	
		<%! Random ran = new Random(); %>
		<% 
		  	request.setCharacterEncoding("UTF-8");
			try{
				System.out.println(request.getParameter("pick"));
				System.out.println(request.getParameterValues("pick")[0]);
			}catch(Exception e){
				System.out.println("오류");
			}
	
			String[] pick = {""};
			if(request.getParameter("pick")==null){
			     pick[0] = "없음";
			}else{
			     pick = request.getParameterValues("pick");
			}
			
	
			//2. 랜덤선택한 메뉴 출력하기 위한 기본 작업
			String[] menu = {"김치볶음밥", "라면", "햄버거", "짜장면",
							"알밥", "초밥", "마라탕", "김밥"} ;
			int index = ran.nextInt(menu.length);

		%>	
	
		<div style="width: 700px; height: 700px; 
			border: 1px solid gray; text-align: center">
			
			<h1>오늘의 메뉴는!!</h1>
			
			<br>
			<img src="./images/EAT.jpg" 
					style="width: 600px; height: 400px">
			<br>
			
			<%

				if ((pick[0] == "없음")){
					out.print("오늘 추천 메뉴는 " + menu[index] + "입니다!");
				     System.out.println("선택 안함 : " + menu[index]);
				}else {
					out.print("선택한 메뉴! ");
					for(String p : pick) {
						out.print(p + " ");
					    System.out.println("/ 선택한 메뉴 " + p);
					}
				}
				
				
				
			%>
			
		</div>
	
	</body>
</html>