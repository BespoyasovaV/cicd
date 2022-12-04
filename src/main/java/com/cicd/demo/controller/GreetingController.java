package com.cicd.demo.controller;

/**
 * @author BespoyasovaV
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {

    @GetMapping("/hi")
    public String greeting(Model model) {
        model.addAttribute("name", " finally, my work was done ");
        return "greeting";
    }


}
