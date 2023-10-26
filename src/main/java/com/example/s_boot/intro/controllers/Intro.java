package com.example.s_boot.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /* @RequestMapping(value = "/user/{id:[\\d]+}/name/{name}", method = RequestMethod.GET)
     @ResponseBody
     public String userById(@PathVariable long id,
                            @PathVariable String name) {
         *//*return "user id = " + id + "user Name = " + name;*//*
        return String.format("user name = %s  id = %s", name, id);
    }*/

    @RequestMapping(value = "/user", method = RequestMethod.GET)
     @ResponseBody
     public String userById(@RequestParam long id) {

        return String.format("user id = %s", id);
    }


}
