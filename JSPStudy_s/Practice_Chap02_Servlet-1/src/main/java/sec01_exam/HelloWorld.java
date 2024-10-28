package sec01_exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// javax.servlet패키지에 예외가 발생하면, 프로젝트 우클릭 build path -> libraries -> add external jars
// ->톰캣폴더/lib -> 찾기(jsp-api.jar,servlet_api.jar추가를 됨

/**
 * Servlet implementation class HelloWorld
 */

//url매핑코드
@WebServlet("/HW")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	// 생성자
    public HelloWorld() {
        
    }

	// servlet파일이 처리하는 부분	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("hellow World");
		System.out.println("doGet()");
    }
    
    // get -> 그냥 출력하는 방식
    // post -> 데이터 가공처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hellow World");
		System.out.println("doPost()");
	}

}
