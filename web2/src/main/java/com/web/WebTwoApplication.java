package com.web;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableSwagger2Doc
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.web")
public class WebTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebTwoApplication.class, args);
    }

}
