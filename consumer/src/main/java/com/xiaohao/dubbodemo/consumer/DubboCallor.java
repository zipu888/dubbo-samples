package com.xiaohao.dubbodemo.consumer;

import com.xiaohao.dubbodemo.consumer.util.SpringContextUtil;
import com.xiaohao.dubbodemo.service.IDubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by xiaohao on 2014/8/1.
 *
 */
@Component
public class DubboCallor {
    @Resource(name="demoService")
    IDubboDemoService service;
    @PostConstruct
    public void test(){
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
       String result =service.sayHello("xiaopang");
        System.out.println(result);
    }

    public IDubboDemoService getService() {
        return service;
    }

    public void setService(IDubboDemoService service) {
        this.service = service;
    }
}
