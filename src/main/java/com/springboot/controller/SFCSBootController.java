package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SFCSBootController {

    @RequestMapping("/")
    public String index() {
        return "Spring boot test";
    }
}
