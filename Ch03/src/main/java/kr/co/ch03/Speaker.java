package kr.co.ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Speaker {
	
	public void soundUp() {
		System.out.println("Speaker sound Up...");
	}
	public void soundDown() {
		System.out.println("Speaker sound Down...");
	}

}
