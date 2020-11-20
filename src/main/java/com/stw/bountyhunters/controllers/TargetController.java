package com.stw.bountyhunters.controllers;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.repositories.TargetRepository;
import com.stw.bountyhunters.services.TargetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class TargetController {

    private final TargetService targetService;

    public TargetController(TargetService targetService) {
        this.targetService = targetService;
    }

    @RequestMapping({"/targets", "/targets/index", "/targets/index.html"})
    public String getItems(Model model) {
        Set<Target> targets = targetService.findAll();

        model.addAttribute("targetsList", targets);

        return "targets/index";
    }
}
