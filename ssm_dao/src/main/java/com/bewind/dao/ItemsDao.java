package com.bewind.dao;

import com.bewind.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Scripture:
 * User:Vast_612520
 * Date:2020/10/18
 */
@Repository
public interface ItemsDao {
    //查询所有方法
    List<Items> findAll();
    //保存方法

    Items findById(int id);

    void add(Items vast);
}
