package com.example.s_boot.members.controllers;

import com.example.s_boot.members.models.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberHandler {
    private static List<Member> members = new ArrayList<>();

    @GetMapping("")
    public String toMembers(Model model) {
        model.addAttribute("members", members);
        return "members/members";
    }

    @GetMapping("/new_member")
    public String toAddMember() {
        return "members/new_member";
    }

    @PostMapping("new_member/create")
    public String createMember(@RequestParam String firstName, @RequestParam String lastName, Model model) {
        //  System.out.printf("First name: %s; Last name: %s \n", firstName, lastName);
        members.add(new Member(firstName, lastName));
        return "redirect:/members";
//        return "members/members";
    }
}
