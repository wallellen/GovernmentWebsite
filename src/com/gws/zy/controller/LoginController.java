package com.gws.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gws.zy.service.IUserInfoService;

import com.gws.zy.model.UserInfo;

import java.sql.Timestamp;
import java.util.UUID;  

@Controller
public class LoginController {
	
	IUserInfoService userInfoService;
	
	@RequestMapping("/login/index")
	public ModelAndView index() {
		return new ModelAndView("login/index"); 
	}	
	
	@RequestMapping("/login/login")
	public ModelAndView login(UserInfo user) {
		user.setId(UUID.randomUUID().toString());
		user.setUpdatedt(new Timestamp(System.currentTimeMillis()));
		user.setCreatedt(new Timestamp(System.currentTimeMillis()));
		return new ModelAndView("login/index"); 
	}	
}
