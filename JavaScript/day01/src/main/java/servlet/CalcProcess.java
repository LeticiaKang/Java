package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcProcess
 */
@WebServlet("/calcProcess")
public class CalcProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 데이터 가져오기
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String operator = request.getParameter("op");
		double n1 = Double.valueOf(num1);
		double n2 = Double.valueOf(num2);
		
		// 2.HTML 문서내 한글 인코딩 방식 지정
		response.setContentType("text/html; charset=utf-8");
		
		// 3. 출력 스트림 가져오기
		PrintWriter out = response.getWriter(); 
		
		// 4. 로직처리 +=> 덧셈...
		double result = 0;
		switch (operator) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = (n1-n2);
			break;
		case "*":
			result = (n1*n2);
			break;
		case "/":
			result = n1/n2;
			break;
		}
		
//		boolean t = (;
		if (result%1==0) {
			int res = (int) result;
			out.print(num1 + operator + num2 + "=" + res);
			}
		else {
			out.print(num1 + operator + num2 + "=" + result);
		}
			
		
	//	out.print(num1 + operator + num2 + "=" + result);
	//  이런 식으로 해도 됨
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
