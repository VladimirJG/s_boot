package com.example.s_boot.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Intro {

    @RequestMapping(method = RequestMethod.GET)
    public String intoGet() {
        return "intro";
    }
}
