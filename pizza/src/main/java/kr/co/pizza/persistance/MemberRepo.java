package kr.co.pizza.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.pizza.vo.MemberVo;


@Repository
public interface MemberRepo extends JpaRepository<MemberVo, String> {

}
