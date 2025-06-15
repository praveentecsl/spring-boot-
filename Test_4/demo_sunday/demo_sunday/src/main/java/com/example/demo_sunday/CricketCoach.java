package com.example.demo_sunday;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements ICouch{

    @Override
    public String getDailyWorkOut(){
        return "I am practicing 15 minutes yoo hooo";
    }
}
