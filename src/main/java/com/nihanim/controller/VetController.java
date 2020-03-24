package com.nihanim.controller;

import com.nihanim.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;

@AllArgsConstructor
public class VetController {
    private final VetService vetService;

    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
