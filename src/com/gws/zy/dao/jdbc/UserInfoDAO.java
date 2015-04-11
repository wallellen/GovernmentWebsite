package com.gws.zy.dao.jdbc;

import com.gws.zy.dao.*;
import com.gws.zy.model.UserInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.RowMapper;

public class UserInfoDAO extends JdbcDaoSupport implements IUserInfoDAO {

	/**
	 * 添加新用户
	 */
	@Override
	public void add(UserInfo user) {
		String sql = "INSERT INTO `UserInfo`(`id`,`Name`,password,`Type`,`Createdt`,`Updatedt`)"
				+ "VALUES(?,?,?,?,?,?);";// 普通的sql语句
		super.getJdbcTemplate()
				.update(sql,
						new Object[] { user.getId(), user.getName(),
								user.getPassword() });
	}

	/**
	 * 根据用户名和密码获取用户
	 */
	@SuppressWarnings("unchecked")
	@Override
	public UserInfo getUsers(String name, String pass) {
		String sql = "SELECT * FROM UserInfo where name=? and password=?;";
		return (UserInfo) super.getJdbcTemplate().queryForObject(sql,
				new Object[] { name, pass }, new RowMapper() {
					@Override
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						UserInfo user = new UserInfo();
						user.setId(rs.getString("id"));
						user.setId(rs.getString("name"));
						user.setId(rs.getString("type"));
						return user;
					}
				});

	}
}
