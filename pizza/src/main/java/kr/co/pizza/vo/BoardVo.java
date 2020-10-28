package kr.co.pizza.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="board_article")
public class BoardVo {
	
	@Id
	private int seq;
	private int parent;
	private int comment;
	private String title;
	private String content;
	private int hit;
	private String uid;
	private String nick;
	private String regip;
	private String rdate;
	

}
