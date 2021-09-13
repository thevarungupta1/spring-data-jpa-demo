package com.thevarungupta.spring.data.jpa.demo;

import com.thevarungupta.spring.data.jpa.demo.entity.Guardian;
import com.thevarungupta.spring.data.jpa.demo.entity.Student;
import com.thevarungupta.spring.data.jpa.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void saveStudent(){
		Student student = Student.builder()
				.firstName("Mark")
				.lastName("Smith")
				.emailId("m@gmail.com")
//				.guardianName("Paul")
//				.guardianEmail("p@gmail.com")
//				.guardianMobile("99999")
				.build();
		studentRepository.save(student);
	}

	@Test
	public void saveStudentWithGuardian(){
		Guardian guardian = Guardian.builder()
				.name("Some name")
				.email("s@gmail.com")
				.mobile("77777")
				.build();

		Student student = Student.builder()
				.firstName("Stacy")
				.lastName("Watson")
				.emailId("s@gmail.com")
				.guardian(guardian)
				.build();

		studentRepository.save(student);
	}

	@Test
	public void displayAllStudents(){
		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}

}
