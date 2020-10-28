package kr.co.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.board.vo.CommentVo;

@Repository
public interface CommentDao {
	
	public void insertComment(CommentVo vo);
	public List<CommentVo> selectComments(int seq);
	public void countComments(CommentVo vo);

}
