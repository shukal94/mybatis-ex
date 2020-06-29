package com.solvd.lab.automation.v2.mybatis.dao.mock;

import com.solvd.lab.automation.v2.mybatis.config.SessionFactory;
import com.solvd.lab.automation.v2.mybatis.dao.CategoryDAO;
import com.solvd.lab.automation.v2.mybatis.model.Category;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategoryDAOMock implements CategoryDAO {


    public void create(Category category) {

    }

    public Category getById(long id) {
        return new Category("name", null);
    }

    public List<Category> get() {
        Category[] cats = new Category[] { new Category("name", null), new Category("name2", null)};
        Stream<Category> stream = Arrays.stream(cats);
        return stream.collect(Collectors.toList());
    }

    public void update(Category category) {

    }

    public void delete(long id) {

    }
}
