package kr.co.ch06;
/*
 * 날짜 : 2020/09/02
 * 이름 : 이태훈
 * 내용 : 스프링 JDBC 실습하기
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JDBCTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		dao.insertUser();
		dao.updateUser();
		dao.deleteUser();
		
		System.out.println("프로그램 종료...");
		
	}//main end
	

}
