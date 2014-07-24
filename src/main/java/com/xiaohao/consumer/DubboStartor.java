package com.xiaohao.consumer;

import com.xiaohao.serviceApi.DemoService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by xiaohao on 2014/7/23.
 */
public class DubboStartor {

    public static void main(String[] args){

        FileSystemXmlApplicationContext context1 = new FileSystemXmlApplicationContext("./src/main/resources/dubbo.xml");
        context1.start();
        FileSystemXmlApplicationContext context = new  FileSystemXmlApplicationContext("./src/main/resources/consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果

    }

}
