package com.ddf.microservicecloud.controller;

import com.ddf.microservicecloud.entity.User;
import com.ddf.microservicecloud.feignservice.HystrixFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author DDf on 2018/5/29
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private HystrixFeignService hystrixFeignService;


    @RequestMapping("/hystrixList")
    public List<User> hystrixList() {
        return hystrixFeignService.hystrixList();
    }

    @RequestMapping("/userList")
    public List<User> userList() {
        return hystrixFeignService.userList();
    }
}
