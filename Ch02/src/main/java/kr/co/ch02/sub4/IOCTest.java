package kr.co.ch02.sub4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 	��¥ : 2020/08/31
 	�̸� : ������
 	���� : DI �����ڸ� �̿��� ������ Ioc ����
 */
public class IOCTest {
	public static void main(String[] args) {
		// Ioc�� Setter DI�� ������ ���
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		kr.co.ch02.sub4.TV lgTV 	 = (kr.co.ch02.sub4.TV) ctx.getBean("sub4LgTV");
		kr.co.ch02.sub4.TV samsungTV = (kr.co.ch02.sub4.TV) ctx.getBean("sub4SamsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}

}
