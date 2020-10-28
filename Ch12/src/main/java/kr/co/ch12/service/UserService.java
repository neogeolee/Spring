package kr.co.ch12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch12.persistence.UserRepo;
import kr.co.ch12.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public void insertUser(UserVO vo) {
		//insert into USER3 values(?,?,?,?) ~ 수행
		repo.save(vo); 
	}
	
	public UserVO selectUser(String uid) {
		//select * from USER3 where uid=? 수행
		return repo.findById(uid).get();
	}
	
	public List<UserVO> selectUsers() {
		//select * from USER3 수행
		return repo.findAll();
	}
	
	public List<UserVO> selectUsersOrderBy(String sort) {
		
		List<UserVO> users = null;
		if(sort.equals("asc")) {
			//select * from USER3 OrderBy `age` ASC; 수행
			users = repo.findUserVoByOrderByAgeAsc();
		}else {
			//select * from USER3 OrderBy `age` DESC; 수행
			users = repo.findUserVoByOrderByAgeDesc();
		}
		return users;
	}
	
	public void updateUser(UserVO vo) {
		//update from USER3 set name=?, hp=?, age=?, where uid=? 수행
		repo.save(vo);
	}
	
	public void deleteUser(String uid) {
		//delete from USER3 where `uid`=? 수행
		repo.deleteById(uid);
	}
	
	

	
}
