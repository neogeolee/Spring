package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Category1Vo;
import kr.co.kmarket.vo.Category2Vo;

@Repository
public interface MainDao {
	
	public List<Category1Vo> selectCategory1();
	public List<Category2Vo> selectCategory2();

}
