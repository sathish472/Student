package com.student.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.student.entity.Student;
import com.student.exception.EmptyInputException;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	public Student getByName(String name) {
		if(name.equals("somu")) {
			throw new EmptyInputException("1", "Empty input");
		}
		return repository.findByName(name);
	}

}
