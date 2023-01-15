package com.luv2code.springboot.demo.mycoolapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "hello world! time on server is " + LocalDateTime.now();
    }

    //expose a new endpoint for 'workout'
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }



}
