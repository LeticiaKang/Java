package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

@WebServlet("/userfavor")
public class userFavor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public userFavor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1. 인코딩
		request.setCharacterEncoding("utf-8");
	
	//2. 데이터 가져오기
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] food = request.getParameterValues("food");
		String[] interest = request.getParameterValues("interest");
		
	//4. 인코딩2
		response.setContentType("text/html; charset=utf-8");
		
	//3. 출력 객체 생성
		PrintWriter out = response.getWriter(); 
		
	//4. 코드 구현
		out.print("<html><head><title>사용자 정보</title></head>");
		out.print("<body>");
		out.print("이름 : " + name + "<br>");
		// 4-1. 22(20대)표현하기
		String number = String.valueOf(age/10);
		//10으로 나누 몫이 1,2,3,4,''' 등에 따라서 뒤에 0을 붙이면 돼
		out.print("나이 : " + age + "(" + number + "0대)" + "<br>");
		out.print("성별 : " + gender + "<br>");
		out.print("좋아하는 음식 : ");
		for(String f : food) {
			out.print(f + " ");
		}

		out.print("<br>관심분야 : ");
		for(String h : interest) {
			out.print(h + " ");
		}
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	}

}
