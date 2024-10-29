package sec_exam01;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LC")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
    public LifeCycleServlet() {
        System.out.println("LifeCycle생성자 호출");
    }
    
    //서버구동시 최초 한번 실행
    @Override
    public void init() throws ServletException {
    	System.out.println("init메서드 호출");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost호출");
	}
	
	// 서버종료시 마지막에 한번만 호출
	@Override
	public void destroy() {
		System.out.println("destroy호출");
	}
	
	//init보다 선처리
	@PostConstruct
	private void initPostConstructor() {
		System.out.println("후처리");
	}
	
	//destroy보다 후처리
	@PreDestroy
	private void destroyPredestroy() {
		System.out.println("프디실행 후처리");
	}
}
