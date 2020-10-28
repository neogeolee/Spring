package kr.co.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping("menu/menu_og")
	public String menu() {
		return "/menu/menu_og";
	}

}
