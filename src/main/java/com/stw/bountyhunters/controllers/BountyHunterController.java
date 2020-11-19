package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.services.BountyHuntersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class BountyHunterController {

    BountyHuntersService bountyHuntersService;

    public BountyHunterController(BountyHuntersService bountyHuntersService) {
        this.bountyHuntersService = bountyHuntersService;
    }

    @RequestMapping({"/bountyhunters", "/bountyhunters/index", "/bountyhunters/index.html"})
    public String getBountyHunters(Model model) {

        List<BountyHunter> bountyHunters = new ArrayList<>();

        BountyHunter bountyHunter1 = new BountyHunter();
        bountyHunter1.setLogin("Rzeju");
        bountyHunter1.setEmail("pandrzejak93@gmail.com");
        bountyHunter1.setPower(10000L);
        bountyHunter1.setMoney(100L);

        BountyHunter bountyHunter2 = new BountyHunter();
        bountyHunter2.setLogin("Gosia");
        bountyHunter2.setEmail("gosia@gmail.com");
        bountyHunter2.setPower(100000L);
        bountyHunter2.setMoney(1000L);

        bountyHunters.add(bountyHunter1);
        bountyHunters.add(bountyHunter2);

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

        bountyHunter1.getUsedItems().add(steelHelmet);

        bountyHunter1.getUsedItems().add(mandalorianMask);


        bountyHuntersService.save(bountyHunter1);
        bountyHuntersService.save(bountyHunter2);

        Set<BountyHunter> hunters = bountyHuntersService.findAll();

        model.addAttribute("hunters", hunters);

        return "bountyhunters/index";
    }
}
