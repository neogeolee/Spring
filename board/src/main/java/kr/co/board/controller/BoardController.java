package kr.co.board.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.board.persistance.BoardRepo;
import kr.co.board.service.BoardService;
import kr.co.board.service.CommentService;
import kr.co.board.vo.BoardVo;
import kr.co.board.vo.CommentVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardRepo boardRepo;
	
	@Autowired
	private BoardService service;
	
	@Autowired
	private CommentService comment;
	
	@GetMapping("/list")
	public String list(Model model, String pg) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountArticles();
		int pageEnd = service.getPageEnd(total);
		
		List<BoardVo> articles = service.selectArticles(start);
		model.addAttribute("articles", articles);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		
		return "/list";
	}
	
	@GetMapping("/view")
	public String view(Model model, int seq, BoardVo vo) {
		
		BoardVo article = service.selectArticle(seq);
		List<CommentVo> ments = comment.selectComments(seq);
		
		model.addAttribute("article", article);
		model.addAttribute("ments", ments);
		
		service.hitArticle(vo);
		
		return "/view";
	}
	
	@PostMapping("/write")
	public String write(BoardVo article, HttpServletRequest req) {
		
		article.setRdate(LocalDateTime.now().toString());
		article.setRegip(req.getRemoteAddr());
		boardRepo.save(article);
		
		return "redirect:/list";
	}
	@GetMapping("/write")
	public String write() {
		return "/write";
	}
	
	@PostMapping("/comment/{seq}")
	public String Comment(CommentVo vo, HttpServletRequest req) {
		vo.setRegip(req.getRemoteAddr());
		
		comment.insertComment(vo);
		comment.countComment(vo);
		return "redirect:/list";
	}
	
	@GetMapping("/modify")
	public String modify(Model model, int seq) {
		BoardVo article = service.selectArticle(seq);
		model.addAttribute("article", article);
		
		return "/modify";
	}
	
	@PostMapping("/modify/{seq}")
	public String modify(BoardVo vo, Model model) {
		
		service.modifyArticle(vo);		
		
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete(int seq) {
		
		service.deleteArticle(seq);
		
		return "redirect:/list";
	}

}
