package com.sivasai.restProject.CrudPractice.Service;

import com.sivasai.restProject.CrudPractice.Model.Student;

import java.util.List;

public interface StudentService {
    String saveStudentDetails(Student student);
    Student getStudentById(long id);
    List<Student> getStudentByName(String name);
    List<Student> getAllStudents();
}
