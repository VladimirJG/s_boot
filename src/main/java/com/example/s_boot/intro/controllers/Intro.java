package com.example.s_boot.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/in")
public class Intro {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping(value = "/about")
    public String about() {
        return "about";
    }

    @GetMapping(value = "/users")
    public String users() {
        return "users";
    }

    /* @RequestMapping(value = "/user/{id:[\\d]+}/name/{name}", method = RequestMethod.GET)
     @ResponseBody
     public String userById(@PathVariable long id,
                            @PathVariable String name) {
         *//*return "user id = " + id + "user Name = " + name;*//*
        return String.format("user name = %s  id = %s", name, id);
    }*/

    @GetMapping(value = {"/user", "/student"},
            params = {"id", "name"})
    @ResponseBody
    public String userById(@RequestParam long id, @RequestParam String name) {

        return String.format("user id = %s user name = %s", id, name);
    }


}
