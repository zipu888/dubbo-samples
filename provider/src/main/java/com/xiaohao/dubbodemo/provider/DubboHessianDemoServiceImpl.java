package com.xiaohao.dubbodemo.provider;

import com.xiaohao.dubbodemo.service.IDubboHessianDemoService;

/**
 * Created by xiaohao on 2014/8/4.
 */
public class DubboHessianDemoServiceImpl implements IDubboHessianDemoService {

    @Override
    public String hasseinSayHello(String name) {
        return "hassein say hello "+name;
    }
}
