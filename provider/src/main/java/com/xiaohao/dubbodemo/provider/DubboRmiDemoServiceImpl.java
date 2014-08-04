package com.xiaohao.dubbodemo.provider;

import com.xiaohao.dubbodemo.service.IDubboRmiDemoService;

/**
 * Created by xiaohao on 2014/8/4.
 */
public class DubboRmiDemoServiceImpl implements IDubboRmiDemoService {

    @Override
    public String rmiSayHello(String name) {
        return "rmi say hello "+name;
    }
}
