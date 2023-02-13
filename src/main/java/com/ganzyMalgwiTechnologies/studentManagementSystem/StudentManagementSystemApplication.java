package com.ganzyMalgwiTechnologies.studentManagementSystem;

import com.ganzyMalgwiTechnologies.studentManagementSystem.entity.Student;
import com.ganzyMalgwiTechnologies.studentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Ibrahim", "Gana", "ibrahimgana@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Patience", "Ibrahim", "patience@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Judith", "Ibrahim", "judith@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Joanna", "Ibrahim", "joanna@gmail.com");
//		studentRepository.save(student4);

	}
}
