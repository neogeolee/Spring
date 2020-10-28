package kr.co.pizza.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="board_member")
public class MemberVo {
	
	@Id
	private String uid;
	private String pass;
	private String nick;
	private String name;
	private int gender;
	private String email;
	private String hp;
	private String zip;
	private String addr1;
	private String addr2;
	private String regip;
	private String rdate;

}
