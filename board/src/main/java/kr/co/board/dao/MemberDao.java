package kr.co.board.dao;

import org.springframework.stereotype.Repository;

import kr.co.board.vo.MemberVo;

@Repository
public interface MemberDao {
	
	public void insertMember(MemberVo vo);
	public MemberVo selectMember(MemberVo vo);

}
