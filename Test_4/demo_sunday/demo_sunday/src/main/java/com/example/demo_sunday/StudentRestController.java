package com.example.demo_sunday;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentRestController {

    private ArrayList<Student> student = new ArrayList<>();

    Student yasith = new Student("Yasith","yasith@gmail.com");
    Student olitha = new Student("olitha","olitha@gmail.com");
    Student praveen = new Student("praveen ","praveen@gmaol.com");



}
