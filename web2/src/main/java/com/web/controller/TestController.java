package com.web.controller;

import com.web.enity.TTest;
import com.web.mapper.TTestMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RestController
@Api(description = "演示模块")
@RequestMapping("/test")
public class TestController {

    @Autowired
    TTestMapper tTestMapper;

    @ApiOperation(value = "演示用", notes = "用于演示给火峰看")
    @GetMapping("/aojiaozuishuai")
    public String getOrderPort(@RequestParam(value = "str", required = false) String str) {
        Example example=new Example(TTest.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id","1");
        List<TTest> list=tTestMapper.selectByExample(example);
        return list.get(0).getName()+str;
    }

}
