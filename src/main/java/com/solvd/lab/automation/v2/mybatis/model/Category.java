package com.solvd.lab.automation.v2.mybatis.model;

public class Category extends AbstractEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.getId() + " " + name;
    }
}
