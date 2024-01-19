package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private IUserService userService;


    @GetMapping("/")
    public String index(){
        for (User user : userService.list()) {
            System.out.println(user.getUserName());
        }
        return "index";
    }
}
