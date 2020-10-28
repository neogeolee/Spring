package kr.co.farmstory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.farmstory.service.UserService;

//@ResponseBody + @Controller�� ��ģ ���ڿ��� JSON�� ����ϴ� Controller

@RestController 
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user/checkUid")
	public String checkUid(String uid) {
		int result = service.selectUserCount(uid);
		JsonObject json = new JsonObject();
		json.addProperty("result", result);
		return new Gson().toJson(json);
	}
	
	@GetMapping("/user/checkNick")
	public String checkNick() {
		
		return null;
	}
	
	@GetMapping("/user/checkEmail")
	public String checkEmail() {
		
		return null;
	}
	
	@GetMapping("/user/checkHp")
	public String checkHp() {
		
		return null;
	}

}