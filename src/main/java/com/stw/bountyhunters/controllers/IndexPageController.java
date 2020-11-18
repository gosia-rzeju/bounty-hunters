package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.BountyHunter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexPageController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/bountyHunters")
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

        model.addAttribute("hunters", bountyHunters);

        return "index";
    }
}
