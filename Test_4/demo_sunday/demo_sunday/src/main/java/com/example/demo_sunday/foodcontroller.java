package com.example.demo_sunday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class foodcontroller {

    @GetMapping("/olitha")
    public  String Banana(){
        return "<h1>dsfdsafdsaf</h1>";

    }

    @GetMapping("/yasith")
    public  String YBanana(){
        return "<h1>YASIIIIIIIIIIIIIIIIIIIITH</h1>";

    }


}
