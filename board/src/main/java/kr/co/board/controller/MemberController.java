package kr.co.board.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.board.persistance.TermsRepo;
import kr.co.board.service.MemberService;
import kr.co.board.vo.MemberVo;
import kr.co.board.vo.TermsVo;

@Controller
public class MemberController {
	
	@Autowired
	private TermsRepo termsRepo;
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {
		
		sess.invalidate();
		
		return "redirect:/login";
	}
	
	
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req) {
		
		vo.setRegip(req.getRemoteAddr());
		vo.setRdate(LocalDateTime.now().toString());
		
		service.insertMember(vo);
		
		
		return "redirect:/member/login";
	}
	
	@GetMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVo vo = termsRepo.findById(0).get();
		model.addAttribute(vo);
		
		return "/member/terms";
	}

}
