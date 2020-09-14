package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.UserDao;
import kr.co.sboard.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class UserDaoTest {
	
	@Inject
	private UserDao dao;
	
	public void selectTerms() {
		dao.selectTerms();
	}
	
	
	public void selectUserCount() {
		int result = dao.selectUserCount("abcd");
		System.out.println("result : "+result);
	}
	
	@Test
	public void insertUser() {
		UserVO vo = new UserVO();
		
		vo.setUid("aarfdda");
		vo.setPass1("1234");
		vo.setName("�Ӳ���");
		vo.setNick("����");
		vo.setEmail("aadd@naver.com");
		vo.setHp("010-1297-4532");
		vo.setRegip("192.91.54.56");
		
		dao.insertUser(vo);
	}

}
