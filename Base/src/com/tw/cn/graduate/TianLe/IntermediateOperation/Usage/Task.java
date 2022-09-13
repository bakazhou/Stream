package com.tw.cn.graduate.TianLe.IntermediateOperation.Usage;

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

    public Integer getId() {
        return id;
    }
}
