package kr.co.pizza.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.pizza.persistance.MemberRepo;
import kr.co.pizza.persistance.TermsRepo;
import kr.co.pizza.service.MemberService;
import kr.co.pizza.vo.MemberVo;
import kr.co.pizza.vo.TermsVo;

@Controller
public class MemberController {
	
	@Autowired
	private TermsRepo termsRepo;
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {
		
		sess.invalidate();
		
		return "redirect:/index";
	}
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/member/login")
	public String login(MemberVo vo, HttpSession sess) {
		
		MemberVo member = service.selectMember(vo);
		
		if(member != null) {
			sess.setAttribute("member", member);
			return "/index";
		}else {
			return "redirect: /member/login";
		}
		
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req) {
		
		vo.setRegip(req.getRemoteAddr());
		vo.setRdate(LocalDateTime.now().toString());
		
		memberRepo.save(vo);
		
		
		return "redirect:/member/login";
	}
	
	@GetMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVo vo = termsRepo.findById(0).get();
		model.addAttribute(vo);
		
		return "/member/terms";
	}

}
