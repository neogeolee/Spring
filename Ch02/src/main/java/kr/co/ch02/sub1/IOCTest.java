package kr.co.ch02.sub1;
/*
 	날짜 : 2020/08/31
 	이름 : 이태훈
 	내용 : 스프링 Ioc 실습하기
 */
public class IOCTest {
	public static void main(String[] args) {
		
		// Ioc 적용 (DI 기법) 을 안할 경우
		TV lgTV = new LgTV();
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		TV samsungTV = new SamsungTV();
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}

}
