<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 받았음~</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
		int[] jumsu = new int[4];
		String name = request.getParameter("name");
		jumsu[0] = Integer.parseInt(request.getParameter("java"));
		jumsu[1] = Integer.parseInt(request.getParameter("web"));
		jumsu[2] = Integer.parseInt(request.getParameter("iot"));
		jumsu[3] = Integer.parseInt(request.getParameter("and"));
		
		double avg = average(jumsu);
		String score = null;
		if(avg >= 95) score = "A+";
		else if (avg >= 90) score = "A";
		else if (avg >= 85) score = "B+";
		else if (avg >= 80) score = "B";
		else if (avg >= 75) score = "C+";
		else if (avg >= 70) score = "C";
		else if (avg >= 65) score = "D+";
		else if (avg >= 60) score = "D";
		else score = "F";
	%>
	
	<%!
		double average(int[] jumsu) {
			double result = (double) (jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3])/jumsu.length;
			return result;		
		}
	%>
	<div style="width: 500px; border:solid 1px gray; text-align:center">
		<h3>학점 확인 프로그램</h3>
		<table align="center">
			<!-- 6행 2열 구성 -->
			<tr>
				<td width="200">이름</td><td width="200"><%= name %></td>
			</tr>
			<tr>
				<td width="200">JAVA 점수</td><td width="200"><%= jumsu[0] %></td>
			</tr>
			<tr>
				<td width="200">WEB 점수</td><td width="200"><%= jumsu[1] %></td>
			</tr>
			<tr>
				<td width="200">IOT 점수</td><td width="200"><%= jumsu[2] %></td>
			</tr>
			<tr>
				<td width="200">ANDROID 점수</td><td width="200"><%= jumsu[3] %></td>
			</tr>
			<tr>
				<td width="200">평균</td><td width="200"><%= avg %></td>
			</tr>
			<tr>
				<td width="200">평점</td><td width="200"><h3><b><%= score %></b></h3></td>
			</tr>
		</table>
	</div>
</body>
</html>