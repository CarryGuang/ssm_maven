package com.chengguang.service.impl;

import com.chengguang.dao.ItemsDao;
import com.chengguang.daomain.Items;
import com.chengguang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
