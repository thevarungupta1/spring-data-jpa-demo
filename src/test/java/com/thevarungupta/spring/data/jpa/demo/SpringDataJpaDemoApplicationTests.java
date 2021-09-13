package com.thevarungupta.spring.data.jpa.demo;

import com.thevarungupta.spring.data.jpa.demo.entity.Student;
import com.thevarungupta.spring.data.jpa.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

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
				.guardianName("Paul")
				.guardianEmail("p@gmail.com")
				.guardianMobile("99999")
				.build();
		studentRepository.save(student);

	}

}
