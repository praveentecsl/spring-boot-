package com.example.demo_sunday;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements ICouch{

    public String getDailyWorkOut(){
        return "BasketBall coach is strating the training";
    }
}
