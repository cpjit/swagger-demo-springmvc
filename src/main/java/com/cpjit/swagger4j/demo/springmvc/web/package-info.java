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
/**
 * @author yonghuan
 */
@APITags(tags = {@APITag(description = "应用程序接口", value = "demo")})
@Items(items = {
        @Item(value = "sex", type = "string", optionalValue = {"男", "女", "未知"}, defaultValue = "未知")
})
package com.cpjit.swagger4j.demo.springmvc.web;

import com.cpjit.swagger4j.annotation.*;

