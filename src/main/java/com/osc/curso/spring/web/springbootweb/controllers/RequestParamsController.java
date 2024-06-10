package com.osc.curso.spring.web.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.oscar.curso.spring.web.springbootweb.models.ParamDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo( @RequestParam String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    
}
