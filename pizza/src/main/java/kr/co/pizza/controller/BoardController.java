package kr.co.pizza.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.pizza.persistance.BoardRepo;
import kr.co.pizza.service.BoardService;
import kr.co.pizza.service.CommentService;
import kr.co.pizza.vo.BoardVo;
import kr.co.pizza.vo.CommentVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardRepo boardRepo;
	
	@Autowired
	private BoardService service;
	
	@Autowired
	private CommentService comment;
	
	@GetMapping("/board/list")
	public String list(Model model, String pg) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountArticles();
		int pageEnd = service.getPageEnd(total);
		
		List<BoardVo> articles = service.selectArticles(start);
		model.addAttribute("articles", articles);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		
		return "/board/list";
	}
	
	@GetMapping("/board/view")
	public String view(Model model, int seq, BoardVo vo) {
		
		BoardVo article = service.selectArticle(seq);
		List<CommentVo> ments = comment.selectComments(seq);
		
		model.addAttribute("article", article);
		model.addAttribute("ments", ments);
		
		service.hitArticle(vo);
		
		return "/board/view";
	}
	
	@PostMapping("/board/write")
	public String write(BoardVo article, HttpServletRequest req) {
		
		article.setRdate(LocalDateTime.now().toString());
		article.setRegip(req.getRemoteAddr());
		boardRepo.save(article);
		
		return "redirect:/board/list";
	}
	@GetMapping("/board/write")
	public String write() {
		return "/board/write";
	}
	
	@PostMapping("/board/comment/{seq}")
	public String Comment(CommentVo vo, HttpServletRequest req) {
		vo.setRegip(req.getRemoteAddr());
		
		comment.insertComment(vo);
		comment.countComment(vo);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/modify")
	public String modify(Model model, int seq) {
		BoardVo article = service.selectArticle(seq);
		model.addAttribute("article", article);
		
		return "/board/modify";
	}
	
	@PostMapping("/board/modify/{seq}")
	public String modify(BoardVo vo, Model model) {
		
		service.modifyArticle(vo);		
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/delete")
	public String delete(int seq) {
		
		service.deleteArticle(seq);
		
		return "redirect:/board/list";
	}

}
