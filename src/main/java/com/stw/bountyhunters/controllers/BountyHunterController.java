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

        Set<BountyHunter> hunters = bountyHuntersService.findAll();

        model.addAttribute("hunters", hunters);

        return "bountyhunters/index";
    }
}
