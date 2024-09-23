package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.smhrd.myapp.mapper.MemberMapper;
import com.smhrd.myapp.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberMapper mapper;
	
	// @RequestMapping() 보다 Springboot에서는 @Get~~ @Post~~ Mapping 권장
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(MemberVO vo) {
		
		// JPA 사용하기
		
		return "mypage";
	}

}
