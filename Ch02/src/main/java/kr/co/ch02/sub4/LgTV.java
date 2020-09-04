package kr.co.ch02.sub4;

public class LgTV implements TV {
	
	private Speaker spk;
	
	public LgTV(Speaker spk) {
		this.spk = spk;
	}
	
	@Override
	public void power() {
		System.out.println("sub4LgTV power....");
		
	}

	@Override
	public void chUp() {
		System.out.println("sub4LgTV Chup....");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}

}
