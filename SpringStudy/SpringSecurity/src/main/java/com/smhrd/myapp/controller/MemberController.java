package com.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MemberController {
	

	
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	@GetMapping("/admin")
	//@PreAuthorize("hasAnyRole('admin')")
	public String admin() {
		return "admin";
	}
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

}
