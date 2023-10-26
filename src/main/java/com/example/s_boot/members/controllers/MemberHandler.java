package com.example.s_boot.members.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/members")
public class MemberHandler {
    @GetMapping
    public String toMembers() {
        return "memebers/memebers";
    }

    @GetMapping("/new_member")
    public String toAddMember() {
        return "members/new_member";
    }

    @PatchMapping("new_member/create")
    public String createMember(@RequestParam String firstName, @RequestParam String lastName) {
        System.out.printf("First name: %s; Last name: %s \n", firstName, lastName);
        return "redirect:/members";
    }
}
