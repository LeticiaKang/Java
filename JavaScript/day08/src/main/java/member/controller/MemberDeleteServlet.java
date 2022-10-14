package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDAO;
import member.dto.MemberVO;

@WebServlet("/memberDelete.do")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberDeleteServlet() {
        super();
    }
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userid = request.getParameter("userid");
		MemberDAO mDao = MemberDAO.getInstance();
		//고객 정보 가져와서 mVo에 저장하기
		MemberVO mVo = mDao.getMember(userid);
		//request에 저장하기
		request.setAttribute("mVo", mVo);
	//	response.setCharacterEncoding("utf-8");
		//저장한 거 다음페이지로 보내기
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("memberDelete.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글 깨짐을 방지
		//response.setContentType("text/html; charset = utf-8");
		// 폼에서 입력한 회원 정보 얻어오기
		String userid = request.getParameter("userid");
		
		MemberDAO mDao = MemberDAO.getInstance();
		
		mDao.userDelete(userid);
		response.sendRedirect("index.jsp");

	}

}
