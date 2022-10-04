package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Star
 */
@WebServlet("/star")
public class Star extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Star() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		
		//1.데이터 가져오기
		int num = Integer.parseInt(request.getParameter("num"));
		String color = request.getParameter("color");
		
		PrintWriter out = response.getWriter();

		//2. 요청한 개수만큼 테이블 만드는 로직 작성하기
		
		out.print("<html><head><title>구구단 출력하기</title></head>");
		out.print("<body>");
		out.print("<table border>");
		
		for(int k=1; k<=num; k++) {
			if (k%2==1) {
				out.print("<tr bgcolor='" +color + "'>");
			}else {
				out.print("<tr>");
			}
				for( int n=1; n <= k; n++) {
					out.print("<td>" + "*" + "</td>");
				}
			out.print("</tr>");
		}
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
