<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	//2. 함수 선언하기
	double Average(int[] allScore){
		double sum = 0;
		for(int s=0; s<allScore.length; s++){
			sum += allScore[s];
		}
		return sum/allScore.length;
	}
%>

<%
	//전송 데이터에 한글 포함될 경우 인코딩 방식 지정
	request.setCharacterEncoding("UTF-8");
	//1. 데이터 가져오기
	int [] allScore = new int[4];
	String name = request.getParameter("name");
	allScore[0] = Integer.parseInt(request.getParameter("java"));
	allScore[1] = Integer.parseInt(request.getParameter("web"));
	allScore[2] = Integer.parseInt(request.getParameter("iot"));
	allScore[3] = Integer.parseInt(request.getParameter("android"));
	double avg = Average(allScore);
%>

<div style="width:400px; border:solid 1px gray;
	 text-align: center">
<h3>학점 확인 프로그램</h3>
<table style="text-align: center
			; margin-left: auto; margin-right: auto">
<tr>
<td>이름</td><td><%=name%></td>
</tr>
<tr>
<td>JAVA 점수</td><td><%=allScore[0]%></td>
</tr>
<tr>
<td>WEB 점수</td><td><%=allScore[1]%></td>
</tr>
<tr>
<td>IOT 점수</td><td><%=allScore[2]%></td>
</tr>
<tr>
<td>ANDROID 점수</td><td><%=allScore[3]%></td>
</tr>
<tr>
<td>평균</td><td><%=avg%></td>
</tr>
<tr>

<td>학점</td>
<td>
<%
if(avg>=95.0 & avg <= 100.0){out.print("A+");}
else if(avg>90.0 & avg < 95.0){out.print("A");}
else if(avg>85.0 & avg < 90.0){out.print("B+");}
else if(avg>80.0 & avg < 85.0){out.print("B");}
else{out.print("F");}
%>
</td>
</tr>
</table>
</div>


</body>
</html>