package com.solvd.lab.automation.v2.mybatis.dao;

import com.solvd.lab.automation.v2.mybatis.model.Category;

import java.util.List;

public interface CategoryDAO {
    void create(Category author);
    Category getById(long id);
    List<Category> get();
    void update(Category author);
    void delete(long id);
}
