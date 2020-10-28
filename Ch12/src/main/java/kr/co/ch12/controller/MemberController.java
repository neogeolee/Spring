package kr.co.ch12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch12.service.MemberService;
import kr.co.ch12.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/list")
	public String list (Model model) {
		List<MemberVO> members = service.selectUsers();
		model.addAttribute("members", members);
		
		return "/member/list";
	}
	
	@GetMapping("/member/register")
	public String register () {
		
		
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register (MemberVO vo) {
		
		service.insertUser(vo);
		
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/modify")
	public String modify () {
		return "/member/modify";
	}

}
