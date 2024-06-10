package com.osc.curso.spring.web.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.curso.spring.web.springbootweb.models.User;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Pepe", "García", "pepe@correo.com");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo spring boot");
        body.put("user", user);

        // body.put("name", "Pepe");
        // body.put("lastName", "García");
        return body;
    }

}
