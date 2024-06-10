package com.osc.curso.spring.web.springbootweb.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute ;
import org.springframework.web.bind.annotation.GetMapping;

import com.oscar.curso.spring.web.springbootweb.models.User;

@Controller
public class UserController {

    // @GetMapping("/details")
    // public String details(Model model){
        // User user = new User ("Pepe", "García")
        // user.setEmail("pepe@correo.com");
    //     model.addAttribute("title", "Hola mundo spring boot");
    //     model.addAttribute("user", user);
    //     return "details";
    // }

    // @GetMapping("/list")
    // public String details(Map<String, Object> model){
    //     model.put("title", "Hola mundo spring boot");
    //     model.put("name", "Pepe");
    //     model.put("lastName", "García");
    //     return "details";
    // }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title", "Listado de usuarios");
        return "list";
        
    }

    public String details(Model model){
        User user = new User("Pepe", "García", "pepe@correo.com");
        model.addAttribute("title", "Hola mundo spring boot");
        model.addAttribute("user", user);
        return "details";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
            new User ("Pepe", "García", "pepe@correo.com"),
            new User ("Juan", "Perez", "Juan@correo.com"),
            new User ("Ander", "Jue"),
            new User ("Petra", "Paz", "paz@correo.com"));
    }
}
