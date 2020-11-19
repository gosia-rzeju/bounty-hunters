package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping({"/items", "/items/index", "/items/index.html"})
    public String getItems(Model model) {

        List<Item> items = new ArrayList<>();

        Item steelHelmet = new Item();
        steelHelmet.setName("Steel Helmet");
        steelHelmet.setPower(100L);
        steelHelmet.setFactorBenefit(1.2);
        steelHelmet.setBuyPrice(150L);
        steelHelmet.setSellPrice(120L);

        Item mandalorianMask = new Item();
        mandalorianMask.setName("Mandalorian Mask");
        mandalorianMask.setPower(75L);
        mandalorianMask.setFactorBenefit(1.4);
        mandalorianMask.setBuyPrice(220L);
        mandalorianMask.setSellPrice(185L);

        items.add(steelHelmet);
        items.add(mandalorianMask);

        model.addAttribute("itemsList", items);

        return "items/index";
    }
}
