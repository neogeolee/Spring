package kr.co.ch02.sub2;

public class SamsungTV implements TV {
	@Override
	public void power() {
		System.out.println("Samsung TV power....");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung TV Chup....");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung TV SoundUp....");
		
	}


}
