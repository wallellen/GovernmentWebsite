package com.gws.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gws.zy.service.IUserInfoService;
import com.gws.zy.model.UserInfo;

import java.sql.Timestamp;
import java.util.UUID;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	private IUserInfoService userInfoService;

	// 登录初始页面
	@RequestMapping("/login/index")
	public ModelAndView index() {
		return new ModelAndView("/login/index");
	}

	@RequestMapping("/login/login")
	public ModelAndView login(UserInfo user, HttpSession httpSession) {
		UserInfo userInfo = userInfoService.GetUsers(user.getName(),
				user.getPassword());

		if (userInfo != null) {
			httpSession.setAttribute("user", userInfo);
			return new ModelAndView("/main/index");
		} else {
			return new ModelAndView("/login/index");
		}
	}

	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
}
