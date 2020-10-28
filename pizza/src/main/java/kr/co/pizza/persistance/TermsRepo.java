package kr.co.pizza.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.pizza.vo.TermsVo;

@Repository
public interface TermsRepo extends JpaRepository<TermsVo, Integer> {

}
