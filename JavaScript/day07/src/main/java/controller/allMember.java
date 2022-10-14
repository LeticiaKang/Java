package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import model.DAO;
import model.MemberVO;

@WebServlet("/ViewAllService")
public class allMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();  
//		String id = (String) session.getAttribute("id");  
		System.out.println("userid");
//		MemberVO member = 
//
//		//DAO 객체 이용하여 확인
//		DAO dao = new DAO();
//		MemberVO mb = dao.allMember(member);
//		
//		//DB연결
//		dao.getConnection();
//		
//		//데이터 처리
//		MemberVO result = dao.allMember(vo);
//		//해당되는 로그인 정보가 있는지 판단
//		if(result != null) {
//			//로그인 성공
//			//세션객체에 멤버정보 저장하고 -->success.jsp
//			HttpSession session = request.getSession();
//			session.setAttribute("member", result);
//			response.sendRedirect("success.jsp");
//			System.out.println("로그인 성공");
//			
//		}else {
//			//로그인 실패 -> login.jsp
//			response.sendRedirect("login.jsp");
//			System.out.println("로그인 실패");
//		}
//		
//		//DB 자원 반환
//		dao.getClose();
//			
//	
	}

}
