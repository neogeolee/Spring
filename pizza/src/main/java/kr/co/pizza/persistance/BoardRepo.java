package kr.co.pizza.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.pizza.vo.BoardVo;


@Repository
public interface BoardRepo extends JpaRepository<BoardVo, Integer> {

}
