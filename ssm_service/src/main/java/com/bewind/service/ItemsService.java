package com.bewind.service;

import com.bewind.pojo.Items;


import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/10/18
 */
public interface ItemsService {
    Items findById(int id);

    List<Items> findAll();

    void add(Items vast);
}
