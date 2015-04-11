package com.gws.zy.service.spring;

import com.gws.zy.model.UserInfo;
import com.gws.zy.service.IUserInfoService;
import com.gws.zy.dao.IUserInfoDAO;

public class UserInfoSpringImpl implements IUserInfoService {
	
	private IUserInfoDAO userInfoDAO;

	/**
	 * 根据用户名和密码获取用户
	 */
	@Override
	public UserInfo GetUsers(String name, String pass) {
		return userInfoDAO.getUsers(name, pass);
	}

	public IUserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}

	public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}
}
