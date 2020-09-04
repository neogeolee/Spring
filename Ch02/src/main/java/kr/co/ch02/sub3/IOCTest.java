package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 	��¥ : 2020/08/31
 	�̸� : ������
 	���� : ������ Ioc - DI Setter ����
 */
public class IOCTest {
	public static void main(String[] args) {
		// Ioc�� Setter DI�� ������ ���
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
