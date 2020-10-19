package com.bewind.controller;

import com.bewind.pojo.Items;
import com.bewind.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Scripture:
 * User:Vast_612520
 * Date:2020/10/19
 */
@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;
    @RequestMapping("/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }
    @RequestMapping("/add")
    public String add(){
        Items vast = new Items();
        vast.setName("xyz");
        itemsService.add(vast);
        return "redirect:/items/list";
    }
}
