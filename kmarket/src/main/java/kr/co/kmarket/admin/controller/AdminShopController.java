package kr.co.kmarket.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminShopController {
	
	@GetMapping("/shop/serarch")
	public String search () {
		return "/shop/serarch";
	}
	@GetMapping("/shop/list")
	public String list () {
		return "/shop/list";
	}
	@GetMapping("/shop/view")
	public String view () {
		return "/shop/view";
	}
	@GetMapping("/shop/cart")
	public String cart () {
		return "/shop/cart";
	}
	@GetMapping("/shop/order")
	public String order () {
		return "/shop/order";
	}
	@GetMapping("/shop/order-complete")
	public String orderComplete () {
		return "/shop/order-complete";
	}

}
