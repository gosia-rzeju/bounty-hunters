package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.Target;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TargetController {
    @RequestMapping({"/targets", "/targets/index", "/targets/index.html"})
    public String getItems(Model model) {

        List<Target> targets = new ArrayList<>();

        Target mythrol = new Target();
        mythrol.setName("Mythrol");
        mythrol.setPower(1100L);
        mythrol.setBounty(450L);

        Target riotMar = new Target();
        riotMar.setName("Riot Mar");
        riotMar.setPower(997L);
        riotMar.setBounty(320L);

        targets.add(mythrol);
        targets.add(riotMar);

        model.addAttribute("targetsList", targets);

        return "targets/index";
    }
}
