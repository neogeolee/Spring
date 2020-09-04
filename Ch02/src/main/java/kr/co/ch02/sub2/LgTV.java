package kr.co.ch02.sub2;

public class LgTV implements TV {

	@Override
	public void power() {
		System.out.println("LgTV power....");
		
	}

	@Override
	public void chUp() {
		System.out.println("LgTV Chup....");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LgTV SoundUp....");
		
	}

}
