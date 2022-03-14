package com.example.i_dont_like_crowded.contorller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {
    @GetMapping("/")
    public String root(){
        return "base/index";
    }

    @RequestMapping("/error")
    public String error(){
        return "base/error";
    }

}
