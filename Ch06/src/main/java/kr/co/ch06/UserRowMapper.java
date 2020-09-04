package kr.co.ch06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<UserVO> {

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserVO vo = new UserVO();
		
		vo.setUid(rs.getNString(1));
		vo.setName(rs.getNString(2));
		vo.setHp(rs.getNString(3));
		vo.setAge(rs.getInt(4));
		
		return vo;
	}

}
