package kr.co.ch12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch12.persistence.MemberRepo;
import kr.co.ch12.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepo repo;
	
	public void insertUser (MemberVO vo) {
		repo.save(vo);
		
	}
	
	public void selectUser () {}
	
	public List<MemberVO> selectUsers () {
		return repo.findAll();
	}
	
	public void updateUser () {}
	
	public void deleteUser () {}

}
