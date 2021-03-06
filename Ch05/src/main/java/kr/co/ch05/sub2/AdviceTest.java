package kr.co.ch05.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020/09/01
 * 이름 : 이태훈
 * 내용 : AOP Advice 동작시점 실습하기 
 */
public class AdviceTest {

	public static void main(String[] args)  {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("bs2");
		
		System.out.println("===================");
		bs.insert();
		System.out.println("-------------------");
		
		System.out.println("===================");		
		bs.select();
		System.out.println("-------------------");
		
		System.out.println("===================");
		bs.update(1);
		System.out.println("-------------------");
		
		
		System.out.println("===================");	
		try {
			bs.delete(1, "abcd");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------");
		
	}
}
