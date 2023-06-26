package com.sivasai.restProject.CrudPractice.Repository;

import com.sivasai.restProject.CrudPractice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findStudentById(long id);
    public List<Student> findStudentByName(String name);
    public List<Student> findAll();
}