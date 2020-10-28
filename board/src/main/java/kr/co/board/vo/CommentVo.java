package kr.co.board.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="board_comment")
public class CommentVo {
	
	@Id
	private int seq;
	private int parent;
	private String nick;
	private String uid;
	private String content;
	private String rdate;
	private String regip;
	
	
	

}
