package com.solvd.lab.automation.v2.mybatis.service;

import com.solvd.lab.automation.v2.mybatis.config.PropertyArgResolver;
import com.solvd.lab.automation.v2.mybatis.constant.ConfigConstant;
import com.solvd.lab.automation.v2.mybatis.dao.CategoryDAO;
import com.solvd.lab.automation.v2.mybatis.dao.impl.CategoryDAOImpl;
import com.solvd.lab.automation.v2.mybatis.dao.mock.CategoryDAOMock;
import com.solvd.lab.automation.v2.mybatis.exception.UnableToReadException;
import com.solvd.lab.automation.v2.mybatis.model.Category;

import java.util.List;

public class CategoryService {
    CategoryDAO categoryDAO;
    public CategoryService() {
        try {
            if (PropertyArgResolver.getInstance().get(ConfigConstant.ENV).equals("DEV")) {
                categoryDAO = new CategoryDAOImpl();
            } else {
                categoryDAO = new CategoryDAOMock();
            }
        } catch (UnableToReadException e) {
            throw new RuntimeException("");
        }

    }

    public Category getCategoryById(long id) {
        return categoryDAO.getById(id);
    }

    public List<Category> getAllCategories() {
        return categoryDAO.get();
    }

    public void createCategory(Category category) {
        categoryDAO.create(category);
    }

    public void deleteCategoryById(long id) {
        categoryDAO.delete(id);
    }

    public void updateCategory(Category category) {
        categoryDAO.update(category);
    }
}
