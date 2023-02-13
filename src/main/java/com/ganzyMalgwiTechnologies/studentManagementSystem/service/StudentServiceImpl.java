package com.ganzyMalgwiTechnologies.studentManagementSystem.service;

import com.ganzyMalgwiTechnologies.studentManagementSystem.entity.Student;
import com.ganzyMalgwiTechnologies.studentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
