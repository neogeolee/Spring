package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.MainService;
import kr.co.kmarket.vo.Category1Vo;
import kr.co.kmarket.vo.Category2Vo;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;
	
	@GetMapping(value= {"/","/index"})
	public String index(Model model) {
		
		List<Category1Vo> category1 = service.selectCategory1();
		List<Category2Vo> category2 = service.selectCategory2();
		model.addAttribute("category1", category1);
		model.addAttribute("category2", category2);
		
		return "/index";
	}

}
