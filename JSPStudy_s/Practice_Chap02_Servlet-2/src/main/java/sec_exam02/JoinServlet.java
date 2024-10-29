package sec_exam02;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public JoinServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()호출");
		request.setCharacterEncoding("UTF-8");//POST방식으로 들어온 데이터의 한글 인코딩
		
		//req로 값을 얻고 res로 응답한다
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
 		String[] hobby = request.getParameterValues("hobby");
 		String major = request.getParameter("magir");
 		String protocol = request.getParameter("protocol");
		
 		response.setContentType("text/html; charset = UTF-8");
 		PrintWriter writer = response.getWriter();
 		
 		writer.println("<HTML><HEAD><HEAD><body>");
 		writer.println("이름"+name);
 		writer.println("아이디"+id);
 		writer.println("비번"+pw);
 		writer.println("취미"+Arrays.toString(hobby));
 		writer.println("</body> </html>");
 		
	}

}
