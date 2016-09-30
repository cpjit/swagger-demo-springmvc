/*
 *
 * Copyright (c) 2011, 2016 CPJ and/or its affiliates. All rights reserved.
 * 
 */
package com.cpj.swagger.demo.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONWriter;
import com.cpj.swagger.annotation.API;
import com.cpj.swagger.annotation.APIs;
import com.cpj.swagger.annotation.Param;

/**
 * @author yonghuan
 */
@Controller
@RequestMapping("/demo")
@APIs("/demo")
public class DemoController {
	@API(value="login", summary="示例1", parameters={
			@Param(name="username", description="用户名", type="string"),
			@Param(name="password", description="密码", type="string", format="password"),
			@Param(name="image" , description="图片", type="file", format="binary")
	})
	@RequestMapping(value="login", method=RequestMethod.POST)
	public void login(HttpServletResponse response, String username, String password, MultipartFile image) throws Exception {
		response.setContentType("application/json;charset=utf-8");
		JSONWriter writer = new JSONWriter(response.getWriter());
		Map<String, String> user = new HashMap<String, String>();
		user.put("username", username);
		user.put("password", password);
		writer.writeObject(user);
		writer.flush();
		writer.close();
	}
	
	@API(value="logout", summary="示例2", parameters={
			@Param(name="username", description="用户名", type="string"),
			@Param(name="password", description="密码", type="string", format="password"),
			@Param(name="image" , description="图片", type="file", format="binary")
	})
	@RequestMapping(value="logout", method=RequestMethod.POST)
	public void logout(HttpServletResponse response, String username, String password, MultipartFile image) throws Exception {
		response.setContentType("application/json;charset=utf-8");
		JSONWriter writer = new JSONWriter(response.getWriter());
		Map<String, String> user = new HashMap<String, String>();
		user.put("username", username);
		user.put("password", password);
		writer.writeObject(user);
		writer.flush();
		writer.close();
	}
}
