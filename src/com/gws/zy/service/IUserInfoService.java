package com.gws.zy.service;

import com.gws.zy.model.UserInfo;

public interface IUserInfoService {
	//根据用户名和密码获取用户
	UserInfo GetUsers(String name, String pass);
}
