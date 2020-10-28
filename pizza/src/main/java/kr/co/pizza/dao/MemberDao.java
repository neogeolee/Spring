package kr.co.pizza.dao;

import org.springframework.stereotype.Repository;

import kr.co.pizza.vo.MemberVo;

@Repository
public interface MemberDao {
	
	public MemberVo selectMember(MemberVo vo);

}
