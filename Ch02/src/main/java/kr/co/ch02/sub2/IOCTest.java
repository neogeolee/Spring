package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 	��¥ : 2020/08/31
 	�̸� : ������
 	���� : ������ Ioc �ǽ��ϱ�
 */
public class IOCTest {
	public static void main(String[] args) {
		
		// Ioc�� Setter DI�� ������ ���
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV lgTV 	 = (TV) ctx.getBean("LgTV");
		TV samsungTV = (TV) ctx.getBean("SamsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
		
		
	}

}
