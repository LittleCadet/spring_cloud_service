package com.cloud.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenxie
 * @date 2021/10/30
 */
@RestController
@RequestMapping("consumer")
public interface TestService {

    @GetMapping("showInfo")
    String showInfo();
}
