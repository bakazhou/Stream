package com.tw.cn.graduate.TianLe;

public class Task {
    public Task(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
