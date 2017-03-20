/*
 * Copyright 2011-2017 CPJIT Group.
 * 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.cpjit.swagger4j.demo.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONWriter;
import com.cpjit.swagger4j.annotation.API;
import com.cpjit.swagger4j.annotation.APIs;
import com.cpjit.swagger4j.annotation.DataType;
import com.cpjit.swagger4j.annotation.Param;

/**
 * @author yonghuan
 */
@Controller
@RequestMapping("/demo")
@APIs("/demo")
public class DemoController {
	@API(value="login", summary="示例1", parameters={
			@Param(name="username", description="用户名", dataType=DataType.STRING),
			@Param(name="password", description="密码", dataType=DataType.PASSWORD),
			@Param(name="image" , description="图片", dataType=DataType.FILE)
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
			@Param(name="username", description="用户名", dataType=DataType.STRING),
			@Param(name="password", description="密码", dataType=DataType.PASSWORD),
			@Param(name="image" , description="图片", dataType=DataType.FILE)
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
