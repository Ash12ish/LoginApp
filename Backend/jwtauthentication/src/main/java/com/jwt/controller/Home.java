package com.jwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Home {
@GetMapping("/welcome")
    public String welcome()
    {
        String text= "this is private page ";
        text+="this page is not allowed to unauthenticated user ";
        return text;
    }

    @RequestMapping("/getusers")
    public String getUser()
    {

        return"{\"name\":\"Ashish\"}";
    }
}
