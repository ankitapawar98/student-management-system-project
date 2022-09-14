package com.practice.projectsms;

import com.practice.projectsms.entity.Student;
import com.practice.projectsms.repository.StudentRepository;
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
//		Student student1 = new Student("Ramesh","Fadtare","ramesh@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Ankita","Pawar","ankita@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Amol","Pawar","ramesh@gmail.com");
//		studentRepository.save(student3);

	}
}
