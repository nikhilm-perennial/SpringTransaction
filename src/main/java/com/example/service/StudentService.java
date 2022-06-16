package com.example.service;

import com.example.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    List<Student> getAllStudents();
    String saveStudent(Student student);
    void deleteStudent(long id);
}
