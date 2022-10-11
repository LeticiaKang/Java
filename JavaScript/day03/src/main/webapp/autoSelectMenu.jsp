<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메뉴 자동 선택하기</title>
	</head>
	<body>
		<form action="autoSelectMenu2.jsp" method="post">
		
			<div style="width: 500px; height: 300px;
					border:1px solid gray" 
					align='center'>
					
				<h3>오늘의 메뉴가 고민이신가요? 
				<br> 
				Pick or Random!
				</h3>
				<br>
		
		
				<select name="pick" id="fruit" multiple="6" >
					<option value="김치볶음밥">김치볶음밥
					<option value="짜장면">짜장면
					<option value="알밥">알밥
					<option value="된장찌개">된장찌개
					<option value="파스타">파스타
				</select>
				<br>
				<br>
				<input type="submit" value="내가 선택하기!" >  
				
				<input type="submit" value="랜던 선택하기!2" onclick="test()"> 
			<!-- 	<button>
					<a href="autoSelectMenu2.jsp" style="text-decoration-line: none">
					랜덤 선택하기!
					</a>
					</button>  -->
				<input type="reset" value="초기화">
			</div>
		</form>
	</body>
</html>

<script type="text/javascript">
    function test() {
		document.getElementByName("pick").value = "없음"
		console.log("test지남");
		<%  System.out.println(request.getParameter("pick")); %>
    }
</script>
