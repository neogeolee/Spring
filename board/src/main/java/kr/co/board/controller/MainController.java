package kr.co.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.board.service.MemberService;
import kr.co.board.vo.MemberVo;

@Controller
public class MainController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping(value={"/", "/login"})
	public String login() {
		return "/login";
	}
	
	@PostMapping("/login")
	public String login(MemberVo vo, HttpSession sess) {
		
		MemberVo member = service.selectMember(vo);
		
		if(member != null) {
			sess.setAttribute("member", member);
			return "redirect:/list";
		}else {
			return "redirect:/login";
		}
	}
}
