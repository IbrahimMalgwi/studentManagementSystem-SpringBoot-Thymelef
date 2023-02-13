package com.ganzyMalgwiTechnologies.studentManagementSystem.repository;

import com.ganzyMalgwiTechnologies.studentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
