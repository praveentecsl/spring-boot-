package com.example.demo_sunday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreRestController {



    private ICouch coach;

    @Autowired
    public CoreRestController( @Qualifier("basketBallCoach")ICouch coach) {
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkOut")
    ResponseEntity<String> getDailyWorkOut(){

        String workout = coach.getDailyWorkOut();

        return new ResponseEntity<>(workout, HttpStatusCode.valueOf(200));

    }
}
