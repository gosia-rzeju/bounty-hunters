package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.services.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class ItemController {

    ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping({"/items", "/items/index", "/items/index.html"})
    public String getItems(Model model) {
        Set<Item> items = itemService.findAll();

        model.addAttribute("itemsList", items);

        return "items/index";
    }
}
