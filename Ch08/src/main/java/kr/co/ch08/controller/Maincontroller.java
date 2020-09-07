package kr.co.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {
	
	@RequestMapping(value={"/", "/index"})
	public String index() {
		return "/index";
	}

}
