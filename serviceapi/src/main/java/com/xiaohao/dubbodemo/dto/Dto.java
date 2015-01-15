package com.xiaohao.dubbodemo.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by xiaohao on 2015/1/15.
 */
public class Dto implements Serializable {

    @NotNull
    Long id;


    @NotNull
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
