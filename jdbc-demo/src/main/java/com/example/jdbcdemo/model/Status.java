package com.example.jdbcdemo.model;

public enum Status {
    ENABLE(0,"enable"),
    DISABLE(1, "disable");

    private String name;
    private Integer value;
    Status(Integer value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
