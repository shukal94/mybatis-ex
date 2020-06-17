package com.solvd.lab.automation.v2.mybatis;

import com.solvd.lab.automation.v2.mybatis.model.Category;
import com.solvd.lab.automation.v2.mybatis.service.CategoryService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CategoryTest {
    private static final Logger LOGGER = Logger.getLogger(CategoryTest.class);

    @Test
    public void testCategoryGetById() {
        Category cat = new CategoryService().getCategoryById(1);
        LOGGER.info(cat.toString());
        Assert.assertEquals(cat.getName(), "scifi");
    }

    @Test
    public void testCategoryGetAll() {
        List<Category> cats = new CategoryService().getAllCategories();
        cats.forEach(e -> LOGGER.info(e.toString()));
        Assert.assertEquals(cats.size(), 3);
    }
}
