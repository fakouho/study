package sec04_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//받아온데이터 글자 인코딩    
		String id = request.getParameter("id"); // 받아온 아이디에 따른 저장
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("안녕하세요");
		out.print("<HTML>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("아이디"+id+"<br>");
		out.print("비밀번호"+pw+"<br>");
		out.print("</body>");
		out.print("</HTML>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post호출");
		request.setCharacterEncoding("utf-8");//받아온데이터 글자 인코딩
		String id = request.getParameter("id"); // 받아온 아이디에 따른 저장
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("안녕하세요");
		out.print("<HTML>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("아이디"+id+"<br>");
		out.print("비밀번호"+pw+"<br>");
		out.print("</body>");
		out.print("</HTML>");
		out.close();
	}

}
