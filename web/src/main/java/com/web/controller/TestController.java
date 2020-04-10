package com.web.controller;

import com.web.feign.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "演示模块")
@RequestMapping("/testb")
@RefreshScope
public class TestController {

    //@Autowired
    private TestService testService;

    @Value("${id:asd}")
    private String id;

    @ApiOperation(value = "演示用", notes = "用于演示给小火峰看")
    @GetMapping("/ceshi")
    public String getOrderPort(String str) {
        return testService.getTestStr(str);
    }

    @GetMapping("/getpz")
    public String getpz(String str) {
        return id;
    }

}
