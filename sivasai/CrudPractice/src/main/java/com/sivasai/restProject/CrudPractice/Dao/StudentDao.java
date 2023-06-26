package com.sivasai.restProject.CrudPractice.Dao;

import com.sivasai.restProject.CrudPractice.Dao.StudentDao;
import com.sivasai.restProject.CrudPractice.Model.Student;
import com.sivasai.restProject.CrudPractice.Repository.StudentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class  StudentDao {

    @Autowired
    StudentRepository studentRepository;

//    private EntityManager entityManager;

//    @Autowired
//    public studentDaoImpl(EntityManager entityManager){
//        this.entityManager = entityManager;
//    }


    public List<Student> getAllStudentsList() {
        return studentRepository.findAll();
    }

    public Student getStudentById(long id) {
        return studentRepository.findStudentById(id);
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    public String SaveStudentDetails(Student student) {
        String str = "Student details saved";
        studentRepository.save(student);
        return str;
    }

}
