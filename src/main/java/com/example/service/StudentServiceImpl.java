package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public String saveStudent(Student student) {
        Student save = studentRepository.save(student);
        if (save.getId()==2){
            int a = 1 / 0;
            System.out.println("Divided by Zero");
        }
        if (save != null){
            System.out.println("Student has been saved");
        }
        return "Student has been saved";
    }

    @Override
    public void deleteStudent(long id) {

    }
}
