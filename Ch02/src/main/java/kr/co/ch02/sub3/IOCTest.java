package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 	날짜 : 2020/08/31
 	이름 : 이태훈
 	내용 : 스프링 Ioc - DI Setter 적용
 */
public class IOCTest {
	public static void main(String[] args) {
		// Ioc를 Setter DI로 적용할 경우
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		kr.co.ch02.sub3.TV lgTV 	 = (kr.co.ch02.sub3.TV) ctx.getBean("sub3LgTV");
		kr.co.ch02.sub3.TV samsungTV = (kr.co.ch02.sub3.TV) ctx.getBean("sub3SamsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}

}
