package com.cloud.service.controller;

import com.cloud.service.feign.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shenxie
 * @date 2021/10/30
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private DataService dataService;

    @Override
    public String showInfo() {
        System.out.println("=============");
        return dataService.showInfo();
    }
}
