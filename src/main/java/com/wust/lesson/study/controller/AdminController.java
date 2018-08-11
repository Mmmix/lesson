package com.wust.lesson.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/")
    public String hello(){
        return "admin/user_list";
    }

    @RequestMapping("/composition")
    public String composition(){
        return "admin/composition";
    }
}
