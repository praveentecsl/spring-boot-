package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("foreign")
    public String foreign(){
        return "foreign";
    }



    @GetMapping("nutrition")
    public String nutri(){
        return "nutrition";
    }


    @GetMapping("/tradi")
    public String tradi(){
        return "traditional";
    }




}
