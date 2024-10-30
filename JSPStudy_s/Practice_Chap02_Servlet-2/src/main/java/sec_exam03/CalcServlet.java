package sec_exam03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static float USD =1210.75F;
	private static float JPY =10.75F;
	private static float CNY =160.75F;
    
    public CalcServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<HTML><title>환율계산기</title>");
		writer.println("<form name ='frmCalc' method = 'get' action='CalcServlet'>");
		writer.println("원화 <input type='text' nam='won'>");
 		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
