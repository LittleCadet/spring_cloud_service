package com.cloud.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shenxie
 * @date 2021/10/30
 */
@FeignClient("provider-service")
public interface DataService {

    @GetMapping("/provider/showInfo")
    String showInfo();
}
