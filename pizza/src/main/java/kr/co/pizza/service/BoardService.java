package kr.co.pizza.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pizza.dao.BoardDao;
import kr.co.pizza.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public List<BoardVo> selectArticles(int start) {
		
		return dao.selectArticles(start); 
	}
	
	public BoardVo selectArticle(int seq) {
		return dao.selectArticle(seq);
	}
	
	public void modifyArticle(BoardVo vo) {
		dao.modifyArticle(vo);
	}
	
	public void deleteArticle(int seq) {
		dao.deleteArticle(seq);
	}
	
	public void hitArticle(BoardVo vo) {
		dao.hitArticle(vo);
	}
	

	
	
	
	// Limit start 계산
	public int getLimitStart(String pg) {
		if(pg == null) {
			return 0;
		}else {
			int page = Integer.parseInt(pg);
			return (page - 1) * 10;			
		}
	}
	
	// 전체 게시물 갯수
	public int selectCountArticles(){
		return dao.selectCountArticles();
	}
	
	// 페이지 번호 계산
	public int getPageEnd(int total) {
		
		int pageEnd = 0;
		
		if(total % 10 == 0) {
			pageEnd = total / 10;
		}else {
			pageEnd = (total / 10) + 1;
		}
		return pageEnd;
	}
	
	// list count 계산
	public int getListCount(int total, int start) {
		return (total - start) + 1;
	}
	

}
