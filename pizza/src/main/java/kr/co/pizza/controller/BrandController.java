package kr.co.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrandController {
	
	@GetMapping("brand/brand")
	public String brand() {
		return "/brand/brand";
	}
	
	@GetMapping("brand/interioir")
	public String interioir() {
		
		return "/brand/interioir";
		
	}

}
