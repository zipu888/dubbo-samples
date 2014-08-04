package com.xiaohao.dubbodemo.provider;

import com.xiaohao.dubbodemo.service.IDubboWebServiceDemoService;

/**
 * Created by xiaohao on 2014/8/4.
 */
public class DubboWebServiceDemoServiceImpl implements IDubboWebServiceDemoService {
    @Override
    public String webServiceSayHello(String name) {
        return "dubbo webService "+name;
    }
}
