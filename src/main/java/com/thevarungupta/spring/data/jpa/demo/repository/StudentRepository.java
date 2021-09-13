package com.thevarungupta.spring.data.jpa.demo.repository;

import com.thevarungupta.spring.data.jpa.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
