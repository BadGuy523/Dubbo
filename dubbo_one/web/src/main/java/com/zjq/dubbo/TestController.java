package com.zjq.dubbo;


import com.zjq.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: BadGuy
 * @date: 2020-03-20 17:16
 **/
@RestController
public class TestController {

    //这里应该声明一个service，但是service最终会变成一个
    //web项目，无法直接依赖，但是此处仍然需要声明对象
    //我们将service的接口声明和实现进行拆分
    //将service创建为一个项目，jar包格式的项目
    //因为除了controller中会用到service外，
    //还有serviceImpl实现中也会用到这个接口

    @Autowired(required = false)
    private TestService service;

    @RequestMapping(value = "/getData", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getData(String name, HttpServletResponse response) {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        String data = service.getData(name);
        return data;
    }
}
