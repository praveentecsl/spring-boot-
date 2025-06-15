package com.example.demo_sunday;

import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private ArrayList<Student> student ;

    @PostConstruct
    public void loadData(){
        student = new ArrayList<>();


        Student yasith = new Student("Yasith","yasith@gmail.com");
        Student olitha = new Student("olitha","olitha@gmail.com");
        Student praveen = new Student("praveen ","praveen@gmaol.com");
        student.add(praveen);
        student.add(olitha);
        student.add(yasith);


    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(student);
    }


☻}
