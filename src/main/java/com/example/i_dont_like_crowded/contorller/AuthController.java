package com.example.i_dont_like_crowded.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/sign-up")
    public String sign_up(){
        return "auth/sign-up";
    }
}
