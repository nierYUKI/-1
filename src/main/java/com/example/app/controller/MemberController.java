package com.example.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.service.MemberService;

import lombok.RequiredArgsConstructor;
@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
private final MemberService service;
@GetMapping
public String list(Model model) throws Exception {
model.addAttribute("members", service.getMemberList());
return "members/list";
}
}