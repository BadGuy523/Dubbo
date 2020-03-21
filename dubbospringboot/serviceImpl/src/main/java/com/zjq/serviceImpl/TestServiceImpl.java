package com.zjq.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zjq.service.TestService;

/**
 * @description:
 * @author: BadGuy
 * @date: 2020-03-21 13:13
 **/
//@Service此处不使用spring这个注解
//此注解的作用就是创建这个类型的对象，然后作为服务提供者发布出去
//相当于我们原先在xml配置文件中配置的东西
@Service(version = "1.0",application = "${dubbo.application.id}",protocol = "${dubbo.protocol.id}",registry = "${dubbo.registry.id}")
public class TestServiceImpl implements TestService {
    @Override
    public String getData(String name) {
        return "result = 啊"+name;
    }
}
