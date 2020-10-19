package com.bewind.service.impl;

import com.bewind.dao.ItemsDao;
import com.bewind.pojo.Items;
import com.bewind.service.ItemsService;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/10/18
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void add(Items vast) {
        itemsDao.add(vast);
    }
}
