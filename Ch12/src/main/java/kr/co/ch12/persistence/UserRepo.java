package kr.co.ch12.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.ch12.vo.UserVO;

@Repository
public interface UserRepo extends JpaRepository<UserVO, String> {
	
	// JPA 쿼리 메서드 정의
	// SELECT * FROM `USER3` OrderBy `age` ASC; 수행
	public List<UserVO> findUserVoByOrderByAgeAsc();
	
	// SELECT * FROM `USER3` OrderBy `age` DESC; 수행
	public List<UserVO> findUserVoByOrderByAgeDesc();

}
