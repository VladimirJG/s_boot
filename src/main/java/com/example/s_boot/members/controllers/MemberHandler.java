package com.example.s_boot.members.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
public class MemberHandler {
    @GetMapping("")
    public String toMembers(Model model) {
        model.addAttribute("firstName", "Jar");
        model.addAttribute("lastName", "Trinity");
        return "members/members";
    }

    @GetMapping("/new_member")
    public String toAddMember() {
        return "members/new_member";
    }

    @PostMapping("new_member/create")
    public String createMember(@RequestParam String firstName, @RequestParam String lastName) {
        System.out.printf("First name: %s; Last name: %s \n", firstName, lastName);
        return "redirect:/members";
    }
}
