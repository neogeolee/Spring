package kr.co.ch02.sub3;

public class SamsungTV implements TV {
	
	private Speaker spk;
	public void setSpk(Speaker spk) {
		this.spk = spk;
	}
	
	@Override
	public void power() {
		System.out.println("sub3Samsung TV power....");
		
	}

	@Override
	public void chUp() {
		System.out.println("sub3Samsung TV Chup....");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}


}
