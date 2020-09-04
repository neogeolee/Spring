package kr.co.ch06;
/*
 * ��¥ : 2020/09/02
 * �̸� : ������
 * ���� : ������ JDBC �ǽ��ϱ�
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
		
		System.out.println("���α׷� ����...");
		
	}//main end
	

}
