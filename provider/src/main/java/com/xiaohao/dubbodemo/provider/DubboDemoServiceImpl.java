package com.xiaohao.dubbodemo.provider;

import com.xiaohao.dubbodemo.service.IDubboDemoService;

/**
 * Created by xiaohao on 2014/8/1.
 */
public class DubboDemoServiceImpl implements IDubboDemoService {

    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
