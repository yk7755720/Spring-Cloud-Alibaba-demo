package com.web.feign;

import com.web.fallback.ConfigServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-gateway",fallback = ConfigServiceFallback.class)
@Service
public interface ConfigtService {

    @RequestMapping(value="/config/getCeshi",method = RequestMethod.GET)
    String getCeshi(@RequestParam(value = "name") String name);
}
