package com.example.i_dont_like_crowded.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/events")
public class EventController {
    @GetMapping("/")
    public String events(){
        return "event/index";
    }

    @GetMapping("/{eventId}")
    public String placeDetail(@PathVariable Integer eventId){
        return "event/detail";
    }

}
