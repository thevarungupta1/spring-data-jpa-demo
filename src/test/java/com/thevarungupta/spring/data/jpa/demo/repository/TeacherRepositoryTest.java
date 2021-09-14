package com.thevarungupta.spring.data.jpa.demo.repository;

import com.thevarungupta.spring.data.jpa.demo.entity.Course;
import com.thevarungupta.spring.data.jpa.demo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    public void saveTeacher(){
        Course course1 = Course.builder()
                .title("CSS")
                .credit(200)
                .build();

        Course course2 = Course.builder()
                .title("Spring")
                .credit(200)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Mark")
                .lastName("Smith")
                .courses(List.of(course1, course2))
                .build();

        repository.save(teacher);
    }


}