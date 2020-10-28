package kr.co.board.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.board.vo.TermsVo;

@Repository
public interface TermsRepo extends JpaRepository<TermsVo, Integer> {

}
