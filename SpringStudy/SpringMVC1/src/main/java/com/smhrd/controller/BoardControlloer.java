package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.db.BoardMapper;
import com.smhrd.model.BoardVO;

// Spring F/W흐름
// 1. Dispatcher Servlet(Front Controller) 요청을 받는다
// 2. Handler Mapping 에게 요쳥값(요청url) 을 보낸다.
// 3. Handler Mapping 요청값과 일치하는 Controller를 Spring Container에서 찾는다.
// 4. Handler Adapter가 HM이 찾은 Controller를 실행

// 해당하는 클래스 파일이 SC(스프링컨테이너) 안에 자동으로 생성될수 있게 만들고,
// Controller임을 명시하는 어노테이션
@Controller // 기능이 정의 되어 있음.
public class BoardControlloer {

	@Autowired
	private BoardMapper mapper;
	// Autowired
	// : 자동으로 연결해줘
	// : Spring Container에서 mapper를 구현한 구현체를 자동으로 연결해준다.

	// 글 상세조회
//	@GetMapping("/boardContent")
//	public String boardContent(int idx) {
//	    System.out.println("수집한데이터>>"+idx);
//	    return "boardContent";
//	}
	// 글 상세조회
	// 경로상에 데이터를 직접적으로 보내주는 경우에 사용할 수 있는 기능
	// /경로/{받아줄데이터이름}
	// @PathVariable("받아줄 데이터 이름")자료형 변수명
	
	@RequestMapping("/boardDelete/{idx}")
	public String deleteBoard(@PathVariable("idx") int idx) {
	    // 게시글을 삭제하는 기능을 구현합니다. (예를 들어, mapper를 사용하여 해당 idx에 해당하는 게시글을 삭제하는 등)
	    mapper.boardDelete(idx);
	    
	    // 삭제가 완료되면 등록 페이지로 리다이렉트합니다.
	    return "redirect:/";
	}
	
	@GetMapping("/boardContent/{idx}")
	public String boardContent(@PathVariable("idx") int idx, Model model) {
		System.out.println("수집한데이터>>" + idx);
		// 1. mapper사용해서 게시글 한개 조회하기
		BoardVO result = mapper.boardContent(idx);
		// 2. 조회한 결과를 model 담아주기
		model.addAttribute("board",result);
		// 3. boardContent.jsp 이동하기
		return "boardContent";
	}

	// 글쓰기 기능을 하는 메소드 생성
	@PostMapping("/register") // -> post전송방식일대만 메소드 실행
	public String register(BoardVO vo) {
		// 1. 요청데이터 수집
		// --> Spring이 알아서 해준다.
		// 메소드의 매개변수로 수집하고 싶은 자료형을 지정해주기만 하면 된다.
		// *** vo 필드명 == 보내주는 name값 == table column명

		System.out.print(vo);
		// 주소값 안나오고 안에 저장되었는 데이터 출력
		// -> @Data >> getter,setter,toString method override
		// toString method?
		// >> 객체의 주소값을 출력하는 대신에, 안쪽에 있는 데이터 출력을 도와주는 object의 메소드

		// 2. mapper 사용하기
		mapper.register(vo);

		// 3. 경로이동
		return "redirect:/";
		// /라는 경로로 이동하겠다->borad메소드 실행 ->boardlist 조회
		// -> 결과값 model ->board로 이동
	}

	// 글쓰기 페이지로 이동하는 메소드 생성
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	// Spring F/W는 url mapping값을 메소드 단위로 설정함.
	// RequedstMapping --> url mapping값을 잡아주는 방법
	@RequestMapping("/") // "/" 요청이 들어왔을 때 board 메소드를 실행
	public String board(Model model) {
		// Model을 가져오는 방법
		// --> 메소드의 매개변수로 해당하는 객체를 작성
		// --> SC가 자동으로 객체를 채워줌!!!
		// 2. DAO 사용해서 결과값 받아오기
		List<BoardVO> list = mapper.boardList();
		// 3. 받아온 결과값 model(request 경량화 버전) 영역에 담아주기
		model.addAttribute("list", list);
		// 4. board.jsp로 forward 방식으로 이동하기
		return "board";
		// board --> 놀리적인 주소값
		// WEB-INF/views/board.jsp --> 물리적인 주소값
		// 놀리적인 주소를 물리적인 주소고 자동 변환하는 View Resolver 객체 이미존제
		// ViewResolver의 역활인?
		// WEB-INF/views/+리턴한 값 +.jsp
	}

}
