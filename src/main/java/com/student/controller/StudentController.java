package com.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	
	@RequestMapping("/log")
	public String log() {
		return "log";
	}

}
