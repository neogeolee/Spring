package kr.co.ch02.sub5;

import org.springframework.stereotype.Component;

@Component("sub5spk")
public class Speaker {
	
	public void soundUp() {
		System.out.println("Speaker sound Up...");
	}
	public void soundDown() {
		System.out.println("Speaker sound Down...");
	}

}
