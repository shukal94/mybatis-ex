package com.solvd.lab.automation.v2.mybatis.model;

public class Author extends AbstractEntity{
    private String name;

    public String getName() {
        return name;
    }

    public Author(String name) {
        this.name = name;
    }

    public Author() {

    }

    public void setName(String name) {
        this.name = name;
    }
}
