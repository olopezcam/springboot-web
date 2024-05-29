package com.osc.curso.spring.web.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oscar.curso.spring.web.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    // public String details(Model model){
    //     model.addAttribute("tittle", "Hola mundo spring boot");
    //     model.addAttribute("name", "Pepe");
    //     model.addAttribute("lastName", "García");
    //     return "details";
    // }

    // public String details(Map<String, Object> model){
    //     model.put("tittle", "Hola mundo spring boot");
    //     model.put("name", "Pepe");
    //     model.put("lastName", "García");
    //     return "details";
    // }

    public String details(Model model){
        User user = new User("Pepe", "García");
        model.addAttribute("tittle", "Hola mundo spring boot");
        model.addAttribute("user", user);
        return "details";
    }
    
}
