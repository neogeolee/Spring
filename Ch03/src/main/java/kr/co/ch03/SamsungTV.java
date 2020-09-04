package kr.co.ch03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SamsungTV implements TV {
	
	@Autowired
	private Speaker spk;
	
	@Autowired
	private Internet internet;

	@Override
	public void power() {
		System.out.println("Samsung TV power....");
		internet.access();
	}

	@Override
	public void chUp() {
		System.out.println("Samsung TV Chup....");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}


}
