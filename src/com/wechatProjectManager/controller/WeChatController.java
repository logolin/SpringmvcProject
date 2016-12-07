package com.wechatProjectManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wechat")
public class WeChatController {

	@RequestMapping("/index")
	public String indexGet() {
		return "index";
	}
}
