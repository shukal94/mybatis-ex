package com.solvd.lab.automation.v2.mybatis.model;

public class Main {
    public static void main(String[] args) {
        Url url = new Url.Builder("jdbc:mysql://localhost:3306/lib").useTimeShift(true).build();
        System.out.println(url);
    }
}
