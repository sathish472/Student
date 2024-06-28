package com.student.repository;

import java.util.List;

import com.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findAll();

	public Student findByName(String name);
}
