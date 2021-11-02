package com.cloud.service.controller;

import com.cloud.service.feign.DataService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenxie
 * @date 2021/11/2
 */
@RestController
@RequestMapping("test")
public class TestService2 {

    @Autowired
    private DataService dataService;

    @GetMapping("/showInfo2")
    public String showInfo2(){
        return dataService.showInfo();
    }
}
