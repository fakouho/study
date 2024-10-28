package sec03_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetorPost")
public class GetorPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetorPostServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get으로 호출");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("안녕하세요");
		out.print("<HTML>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>doGet방식입니다.</h1>");
		out.print("</body>");
		out.print("</HTML>");
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post으로 호출");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("안녕하세요");
		out.print("<HTML>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>doPost방식입니다.</h1>");
		out.print("</body>");
		out.print("</HTML>");
		out.close();
	}

}
