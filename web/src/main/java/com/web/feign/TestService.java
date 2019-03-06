package com.web.feign;

import com.web.fallback.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "web-two",fallback = TestServiceFallback.class)
public interface TestService {
    @RequestMapping(value="/test/aojiaozuishuai",method = RequestMethod.GET)
    public String getTestStr(@RequestParam(value = "str") String str);
}
