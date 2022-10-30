package com.example.habilitacionc3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WedController {

    @GetMapping(name = "/index")
    public String index(){
        return "index";
    }
}
