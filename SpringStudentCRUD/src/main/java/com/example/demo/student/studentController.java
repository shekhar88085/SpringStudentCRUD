package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
@Component
public class studentController {
	private final studentService studentservice;
	@Autowired
	public studentController(studentService studentservice) {
	// 	super();
		this.studentservice = studentservice;
	}
	@GetMapping
	public List<Student> getStudents() {
		return studentservice.getStudents();
	}
}
