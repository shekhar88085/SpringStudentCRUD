package com.example.demo;
//import com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

//import com.sun.tools.javac.util.List;

@SpringBootApplication
public class SpringStudentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentCrudApplication.class, args);
	}
	

}
