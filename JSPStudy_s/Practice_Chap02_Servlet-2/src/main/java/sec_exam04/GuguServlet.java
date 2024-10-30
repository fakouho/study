package sec_exam04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugu")
public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GuguServlet() {
        
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("정보 받아오기 성공");

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        writer.print("<html><body>");
        writer.print("<table border=1 width=800 align='center'>");
        writer.print("<tr align='center' bgcolor='red'>");
        writer.print("<td colspan=4>" + num + "단 출력</td></tr>");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                writer.print("<tr align='center' bgcolor='blue'>");
            } else {
                writer.print("<tr align='center' bgcolor='green'>");
            }
            writer.print("<td width=200>" + num + "</td>");
            writer.print("<td width=200>" + i + "</td>");
            writer.print("<td width=200>" + num + " * " + i + "</td>");
            writer.print("<td width=200>" + (num * i) + "</td>");
            writer.print("</tr>");
        }
        
        writer.print("</table>");
        writer.print("</body></html>");
        writer.close();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
