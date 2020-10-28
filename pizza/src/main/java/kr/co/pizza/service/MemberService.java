package kr.co.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pizza.dao.MemberDao;
import kr.co.pizza.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao; 
	
	public MemberVo selectMember(MemberVo vo) {
		return dao.selectMember(vo);
	}

}
