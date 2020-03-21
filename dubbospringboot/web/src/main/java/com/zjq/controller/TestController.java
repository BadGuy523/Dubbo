package com.zjq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjq.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: BadGuy
 * @date: 2020-03-21 14:05
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    //@Autowired此处不用此注解
    @Reference(version = "1.0",application = "")
    private TestService testService;

    @RequestMapping("/getData/{name}")
    public String getData(@PathVariable("name") String name) {
        String data = testService.getData(name);
        return data;
    }

}
