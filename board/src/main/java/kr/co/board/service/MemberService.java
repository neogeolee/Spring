package kr.co.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.board.dao.MemberDao;
import kr.co.board.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao; 
	
	public void insertMember(MemberVo vo) {
		dao.insertMember(vo);
	}
	
	public MemberVo selectMember(MemberVo vo) {
		return dao.selectMember(vo);
	}

}
