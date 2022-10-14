<%@page import="java.sql.*"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>디비 연동</h4>

<%		try{
			Context initContext = new InitialContext();
			// (Context) initCtx.lookup("java:comp/env")에서“”안에 
			// 기술된 이름을 lookup()메소드를 사용해서 찾음
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			//ontext객체의 lookup 메소드 이용하여 "jdbc/mysql“ 관련 객체를 리턴. 
			//이 때 DataSource 객체 타입으로 형변환함
			DataSource ds = (DataSource) envContext.lookup("jdbc/mysql");
			Connection conn = ds.getConnection();
			if(conn!=null){
				out.println("DBCP 연동 성공");
			}else {
				out.println("DBCP 연동 실패"); 
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
%>
</body>
</html>