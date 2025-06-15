package com.example.demo_sunday;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private ArrayList<Student> student ;

    @PostConstruct
    public void loadData(){
        student = new ArrayList<>();


        Student yasith = new Student(100,"Yasith","yasith@gmail.com");
        Student olitha = new Student(200,"olitha","olitha@gmail.com");
        Student praveen = new Student(300,"praveen ","praveen@gmaol.com");
        student.add(praveen);
        student.add(olitha);
        student.add(yasith);


    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(student);
    }

    @PostMapping("/student")
    public ResponseEntity<String> createNewStudent(@RequestBody Student newStudent){

        student.add(newStudent);

        return new ResponseEntity<>("created the "+newStudent.getName()+"finally", HttpStatusCode.valueOf(200));
    }

    @PutMapping("/Student/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int Id){

        if(Id>0){
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
        for(Student student : student){
            if(student.getId() == Id){
                return new ResponseEntity<>(student, HttpStatus.FOUND);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/student")
    public ResponseEntity<Student> updateStudent(@PathVariable int Id, @RequestBody Student updateStudent){
        if(Id>0){
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
        for(Student student : student){
            if(student.getId() == Id){
                student.setEmail(updateStudent.getEmail());
                student.setName(updateStudent.getName());

                return new ResponseEntity<>(student,HttpStatus.NOT_FOUND);
            }

        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
