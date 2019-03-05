package com.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "演示模块")
@RequestMapping("/test")
public class TestController {


    @ApiOperation(value = "演示用", notes = "用于演示给火峰看")
    @GetMapping("/aojiaozuishuai")
    public String getOrderPort(String str) {
        return "输出："+str;
    }

}
