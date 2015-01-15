package com.xiaohao.dubbodemo.service;

import com.xiaohao.dubbodemo.dto.Dto;

import javax.validation.constraints.NotNull;

/**
 * Created by xiaohao on 2014/8/1.
 */
public interface IDubboDemoService {

    public String sayHello(@NotNull String name);

    public String sayMorning(String name);

    public String saveDto(@NotNull Dto dto);

}
