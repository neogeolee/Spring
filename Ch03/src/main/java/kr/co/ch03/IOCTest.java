package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 	��¥ : 2020/08/31
 	�̸� : ������
 	���� : DI ������̼� �̿��� ������ Ioc ����
 	
 	������̼� ����
 	@Component 
 		- ������ �����̳ʰ� �ش� ������̼� ���� Ŭ������ ���, ����
 		- @Controller, @Service, @Repository�� ����ȭ
 		
	@Autowired 
		- ��������(��ü)�� ��ü�� �����ϴ� ������̼�
		- ������ ���� ������̼�
		
	@Inject 
		- ��������(��ü)�� ��ü�� �����ϴ� ������̼�
		- �ڹ� ���� ������̼�
 	
 */
public class IOCTest {
	public static void main(String[] args) {
		// Ioc�� Setter DI�� ������ ���
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV lgTV =  (TV) ctx.getBean("lgTV");
		TV samsungTV = (TV) ctx.getBean("samsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}

}
