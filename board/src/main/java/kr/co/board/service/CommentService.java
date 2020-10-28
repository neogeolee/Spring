package kr.co.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.board.dao.CommentDao;
import kr.co.board.vo.CommentVo;

@Service
public class CommentService {
	
	@Autowired
	private CommentDao dao;
	
	public void insertComment(CommentVo vo) {
		dao.insertComment(vo);
	}
	
	public List<CommentVo> selectComments (int seq){
		return dao.selectComments(seq);
	}
	
	public void countComment(CommentVo vo) {
		dao.countComments(vo);
	}

}
