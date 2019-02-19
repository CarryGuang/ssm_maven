package com.chengguang.controller;


import com.chengguang.daomain.Items;
import com.chengguang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/findById")
    public String findById(Model model){
        Items item = service.findById(1);
        model.addAttribute("item",item);
        return "list";
    }
}
