package kr.co.board.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.board.vo.BoardVo;


@Repository
public interface BoardRepo extends JpaRepository<BoardVo, Integer> {

}
