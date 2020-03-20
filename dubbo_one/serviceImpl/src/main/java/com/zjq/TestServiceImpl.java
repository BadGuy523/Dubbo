package com.zjq;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: BadGuy
 * @date: 2020-03-20 18:07
 **/
@Service("testServiceImpl")
public class TestServiceImpl implements TestService{
    @Override
    public String getData(String name) {
        return "您传递的数据是"+name;
    }
}
