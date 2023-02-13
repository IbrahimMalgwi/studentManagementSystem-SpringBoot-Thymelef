package com.ganzyMalgwiTechnologies.studentManagementSystem.service;

import com.ganzyMalgwiTechnologies.studentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
