package com.xiaohao.dubbodemo.consumer.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by xiaohao on 2014/7/30.
 */
@Component("springContextUtil")
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext =applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


}
