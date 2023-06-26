package com.sivasai.restProject.CrudPractice.controllers;


import com.sivasai.restProject.CrudPractice.Model.Student;
import com.sivasai.restProject.CrudPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/homePage")
    public String test_working(){
        return "Sample project with CRUD operations";
    }

    @PostMapping(value = "/student/save")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.saveStudentDetails(student));
    }

    @GetMapping(value = "/student/{id}")
    public Student getStudent(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
