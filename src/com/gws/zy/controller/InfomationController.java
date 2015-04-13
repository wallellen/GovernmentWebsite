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
public class InfomationController {
	// 意见箱初始页面
	@RequestMapping("/suggestionBox/index")
	public ModelAndView suggestionBoxIndex() {
		return new ModelAndView("/suggestionBox/index");
	}
}
