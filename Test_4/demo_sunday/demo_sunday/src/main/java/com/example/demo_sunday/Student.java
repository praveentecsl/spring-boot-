package com.example.demo_sunday;

import java.security.PrivateKey;
import java.util.Random;

public class Student {
    private  Integer Id;
    private  String name;
    private  String email;

public Student( int Id, String name, String email) {
//    Random random = new Random();
//    Id = random.nextInt(0,100);
    this.Id = Id;
    this.name = name;
    this.email = email;
}

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
