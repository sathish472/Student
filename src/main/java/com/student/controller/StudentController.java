package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.StudentService;
import com.student.entity.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/log")
	public String log() {
		return "log";
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/studentByName/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getByName(@PathVariable String name) {
		return studentService.getByName(name);
	}

}
