package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.w3c.dom.Entity;

import com.smhrd.myapp.entity.MemberEntity;
import com.smhrd.myapp.mapper.MemberMapper;
import com.smhrd.myapp.vo.MemberVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	private MemberMapper mapper;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
	@GetMapping("/join")
	public String join() {
	    return "join"; // 회원가입 페이지를 나타내는 뷰의 이름을 반환합니다.
	}

	@PostMapping("/login")
	public String login(MemberVO vo, RedirectAttributes rttr) {
		//                            다음 정보까지 정보를 유지시켜주는
		MemberEntity Entity = mapper.findByIdAndPw(vo.getId(), vo.getPw());
		// entity(JPA용) --> vo(java,jsp용)로 변경
		MemberVO myData = new MemberVO(Entity.getId(), Entity.getPw(), Entity.getName(), Entity.getTel());
		rttr.addAttribute("myData",myData.getId());
		// 주의할 점 : 들어간 value의 형태를 String으로 변환가능한 형태로 넣어주기
		// redirect:/mypage?myData=
		// /login 페이지 유효
		// /mypage 페이지 유효
		return "redirect:/mypage";
		//       url을 바꿔주기 위한 redirect
	}
	
	@PostMapping("/join-process")
	public String joinPprocess(MemberVO vo) {
	    System.out.println(vo);
	    MemberEntity entity = new MemberEntity(vo);
	    mapper.save(entity);
	    // update sql구문도 save 처리
	    // --> svae(entity)
	    //--> entity안에 idx가 있으면 update, 없으면 insert
	    return "redirect:/";
	}

//////////////////session/////////////////////////////////	
//	@PostMapping("/login")
//	public String login(MemberVO vo, HttpSession session) {
////		mapper.login(vo);
//		//JPA(mapper==repository)
//		MemberEntity Entity =  mapper.findByIdAndPw(vo.getId(),vo.getPw());
//		System.out.println("entity>>"+Entity);
//		MemberVO myData= new MemberVO(Entity.getId(),Entity.getPw(),Entity.getName(),Entity.getTel());
//		// Model : request 경량화 버전
//		// --> 응답을 되돌려주기 전까지만 유효
//		
//		// mypage.jsp 하나 만들어서
//		// 받아온 사용자의 정보를 pw빼고 전부 출력
//		//Entity(JPA용)->vo(java,jsp용)로 변경
//		session.setAttribute("myData", myData);
//		
//		return "redirect:/mypage";
//		// 요청2 응답2
//	}

}
