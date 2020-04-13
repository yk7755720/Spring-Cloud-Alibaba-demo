package com.web.fallback;

import com.web.feign.ConfigtService;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceFallback implements ConfigtService {

    @Override
    public String getCeshi(String name) {
        return "获取测试失败";
    }
}
