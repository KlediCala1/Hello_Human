package com.dojo.hello_human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping
    public String hello(@RequestParam(value = "name",required=false)String name , @RequestParam(value = "last_name",required=false) String lastname) {
        if (name == null) {
            return "Hello Human";
        }
        return "Hello " + name + " " + lastname;
    }
}
