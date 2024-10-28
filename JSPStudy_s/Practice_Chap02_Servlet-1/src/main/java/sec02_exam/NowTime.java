package sec02_exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Now")
public class NowTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NowTime() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//문자셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//서플릿은 JSP표준 이전에 등장한 표준
		// 하여 지금까지 살펴본 web.xml매핑과 어노테이션 메핑중 web.xml이 더욱 강함
		
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>현재시간</TITLE><HEAD>");
		out.println("<BODY>");
		out.println("지금 시간은");
		out.println(new Date());
		out.println("입니다.");
		out.println("<BODY>");
		out.println("</HTML>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
