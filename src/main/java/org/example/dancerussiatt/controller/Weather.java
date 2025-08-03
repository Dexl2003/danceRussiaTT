package org.example.dancerussiatt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Wather {


    @GetMapping
    public String index() {
        return  "Hello World";
    }




}
