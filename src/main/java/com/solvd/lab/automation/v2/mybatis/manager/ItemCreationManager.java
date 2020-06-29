package com.solvd.lab.automation.v2.mybatis.manager;

import com.solvd.lab.automation.v2.mybatis.model.Item;

public class ItemCreationManager {
    private static ItemCreationManager instance;

    private ItemCreationManager() {

    }

    public synchronized static ItemCreationManager getInstance() {
        if (instance == null) {
            return new ItemCreationManager();
        }
        return instance;
    }

    public Item createMexicoItem() {
        return null;
    }

    public Item createIndonesianItem() {
        return null;
    }
}
