package com.cloud.service.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenxie
 * @date 2021/10/30
 */
@RestController
@RequestMapping("provider")
public class TestServiceImpl implements TestService{


    @Override
    @GetMapping("/showInfo")
    public String showInfo() {
        return "provider message";
    }
}



