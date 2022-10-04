package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "My first servlet!", urlPatterns = { "/HelloWorld" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// html문서는 utf-8로 인코딩 됨을 지정
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>Hello World!!</h3>");
		out.print("헬로월드");	
		//이미지를 포함하는 코드
		out.print("<br><img src='images/라이언.jpg'>");
		
		//메모리에 있는 데이터를 출력해서 확인하는 과정
		System.out.println("ContextPath: " + request.getContextPath());
		System.out.println("RequestURL: " + request.getRequestURI());
		System.out.println("LocalAddr: " + request.getLocalAddr());
		System.out.println("LocalPort: " + request.getLocalPort());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
