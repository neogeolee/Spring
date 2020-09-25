package kr.co.kmarket.admin.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMemberService {
	
	@GetMapping("/member/join")
	public String join() {
		return "/member/join";
	}
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@GetMapping("/member/register-seller")
	public String registerSeller() {
		return "/member/register-seller";
	}
	@GetMapping("/member/signup")
	public String signUp() {
		return "/member/signup";
	}

}
