package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userTableSelect")
public class UserTableSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserTableSelect() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 인코딩
			request.setCharacterEncoding("utf-8");
			
		//2. 데이터 가져오기
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String pwcheck = request.getParameter("pwcheck");
			String gender = request.getParameter("gender");
			String blood = request.getParameter("blood");
			String birth = request.getParameter("birth");
			String[] hobby = request.getParameterValues("hobby");
			String color = request.getParameter("color");
			String write = request.getParameter("write");
			
		//4. 인코딩2
			response.setContentType("text/html; charset=utf-8");
			
		//3. 출력 객체 생성
			PrintWriter out = response.getWriter(); 
			
		//4. 코드 구현
			out.print("<html><head><title>사용자 정보</title></head>");
			out.print("<body>");
			out.print("아이디 : " + id + "<br>");
			out.print("비밀번호 : " + pw + "<br>");
			System.out.println(pw + "와" + pwcheck);
			if (pw.equals(pwcheck)) {
				out.print("비밀번호가 일치합니다.<br>"+pwcheck+"<br>");
			}else {
				out.print("비밀번호가 일치하지 않습니다.<br>");
			}
			
			out.print("성별 : "+gender+"<br>");
			out.print("혈액형 : "+blood+"<br>");
			out.print("생일 : "+birth+"<br>");
			out.print("취미 : ");
			for (String h : hobby) {
				out.print(h + " ");
			}
			out.print("<br>");
			out.print("좋아하는 색 : "+color+"<br>");
			
			out.print("<table><tr><td style='background: " + color + "; width:100px; height:100px;'></td></tr></table>");
			
			out.print("하고 싶은 말 : "+write+"<br>");
			out.print("</body>");
			out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
