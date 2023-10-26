package com.example.s_boot.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/in")
public class Intro {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String users() {
        return "users";
    }

    @RequestMapping(value = "/user/{id}/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String userById(@PathVariable long id,
                           @PathVariable String name) {
        /*return "user id = " + id + "user Name = " + name;*/
        return String.format("user name = %s  id = %s", name, id);
    }
}
