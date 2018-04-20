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

import com.cpjit.swagger4j.annotation.*;
import com.sun.prism.PixelFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yonghuan
 */
@RestController
@RequestMapping("/demo")
@APIs("/demo")
public class DemoController {
    @Post(value = "login", summary = "示例1", parameters = {
            @Param(name = "username", description = "用户名", dataType = DataType.STRING, required = true, in = "body"),
            @Param(name = "password", description = "密码", dataType = PixelFormat.DataType.PASSWORD, required = true, in = "body"),
            @Param(name = "sex", description = "性别", dataType = DataType.INTEGER, items = "0,1", in = "body"),
    })
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Object login(@RequestBody Map<String, Object> param) throws Exception {
        return param;
    }

    @Post(value = "logout", summary = "示例2", parameters = {
            @Param(name = "username", description = "用户名", dataType = DataType.STRING),
            @Param(name = "password", description = "密码", dataType = DataType.PASSWORD),
            @Param(name = "image", description = "图片", dataType = DataType.FILE)
    })
    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public Object logout(String username, String password, MultipartFile image) throws Exception {
        Map<String, String> user = new HashMap<>();
        user.put("username", username);
        user.put("password", password);
        return user;
    }
}
