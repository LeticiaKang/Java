package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

@WebServlet("/testservlet")
public class testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public testservlet() {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 데이터 받아오기 id = ID, pass = Password
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		//2. 인코딩
		response.setContentType("text/html; charset=UTF-8");
		//3. 출력스트림
		PrintWriter out = response.getWriter();
		//로직 처리 및 HTML 출력
		//4. id 님 환영합니다.
		out.print("<html><head><title>로그인 결과</title></head>");
		out.print("<body>");
		//5. <b> 볼드체 설정 </b>
		out.print("<b>"+id+"</b>님 환영합니다.");
		out.print("</body>");
		out.print("</html>");
		
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
