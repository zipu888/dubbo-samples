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
public class DubboCallor {

    IDubboDemoService service;
    public void test(){
        System.out.println("####################################################################################################");
        System.out.println();
        String result =service.sayHello("xiaopang");
        String result1 =service.sayMorning("xiaoli");
        System.out.println(result);
        System.out.println(result1);
        System.out.println();
        System.out.println("####################################################################################################");

    }

    public IDubboDemoService getService() {
        return service;
    }

    public void setService(IDubboDemoService service) {
        this.service = service;
    }
}
