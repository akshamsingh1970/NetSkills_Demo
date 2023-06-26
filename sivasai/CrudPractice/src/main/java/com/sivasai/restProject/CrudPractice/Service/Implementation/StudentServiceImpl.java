package com.sivasai.restProject.CrudPractice.Service.Implementation;

import com.sivasai.restProject.CrudPractice.Dao.StudentDao;
import com.sivasai.restProject.CrudPractice.Model.Student;
import com.sivasai.restProject.CrudPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public String saveStudentDetails(Student student) {
        if(Objects.isNull(student)){
            throw new IllegalArgumentException("Student or object entity can't be null");
        }
        if(Objects.isNull(student.getName())){
            throw new IllegalArgumentException("Student name entity can't be null");
        }
        return studentDao.SaveStudentDetails(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudentsList();
    }
}
