package com.gws.zy.dao;

import java.util.List;

import com.gws.zy.model.UserInfo;

public interface IUserInfoDAO {

	void add(UserInfo user);

	UserInfo getUsers(String name, String pass);
}
