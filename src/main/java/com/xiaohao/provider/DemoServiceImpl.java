package com.xiaohao.provider;


import com.xiaohao.serviceApi.DemoService;

/**
 * Created by xiaohao on 2014/7/23.
 *
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
