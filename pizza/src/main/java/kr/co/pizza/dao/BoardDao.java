package kr.co.pizza.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import kr.co.pizza.vo.BoardVo;

@Repository
public interface BoardDao {
	
	public List<BoardVo> selectArticles(int start);
	public int selectCountArticles();
	public BoardVo selectArticle(int seq);
	public void modifyArticle(BoardVo vo);
	public void deleteArticle(int seq);
	public void hitArticle(BoardVo vo);

}
