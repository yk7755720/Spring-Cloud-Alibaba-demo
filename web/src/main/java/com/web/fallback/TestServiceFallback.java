package com.web.fallback;

import com.web.feign.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceFallback implements TestService {

    @Override
    public String getTestStr(String str) {
        return "报错超时都会降级走这边";
    }
}
