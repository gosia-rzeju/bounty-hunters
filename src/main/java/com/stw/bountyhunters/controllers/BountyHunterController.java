package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.commands.BountyHunterCommand;
import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.services.BountyHuntersService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
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

    @RequestMapping("/bountyhunter/show/{id}")
    public String getBountyHunterById(@PathVariable("id") Long id, Model model) {

        BountyHunter hunter = bountyHuntersService.findById(id);

        model.addAttribute("hunter", hunter);

        return "bountyhunter/show";
    }

    @RequestMapping("bountyhunter/new")
    public String newBountyHunter(Model model) {
        model.addAttribute("huntercommand", new BountyHunterCommand());

        return "bountyhunter/bountyhunterform";
    }

    @PostMapping
    @RequestMapping("bountyhunter")
    public String saveOrUpdate(@ModelAttribute BountyHunterCommand command) {

        BountyHunterCommand savedCommand = bountyHuntersService.saveBountyHunterCommand(command);

        return "redirect:bountyhunter/show/" + savedCommand.getId();
    }

    @RequestMapping({"/bountyhunter/create/{id}/{name}/{power}"})
    public String createBountyHunter(@PathVariable("id") Long id, @PathVariable("name") String name,
                                     @PathVariable("power") Long power, Model model) {

        BountyHunter hunter = new BountyHunter();
        hunter.setId(id);
        hunter.setName(name);
        hunter.setPower(power);

        BountyHunter savedHunter = bountyHuntersService.save(hunter);

        Set<BountyHunter> hunters = new HashSet<>();
        hunters.add(savedHunter);

        model.addAttribute("hunters", hunters);

        return "bountyhunters/index";
    }

    @ResponseBody
    @RequestMapping(value = {"/getjson/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public BountyHunterCommand getJsonResponse(@PathVariable("id") Long id) {
        BountyHunter hunter = bountyHuntersService.findById(id);

        BountyHunterCommand response = new BountyHunterCommand();
        response.setId(hunter.getId());
        response.setName(hunter.getName());
        response.setPower(hunter.getPower());

        return response;
    }
}
