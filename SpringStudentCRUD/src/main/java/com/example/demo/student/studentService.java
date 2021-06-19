package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class studentService {
	
		public List<Student> getStudents() {
			return List.of(new Student(1L, "Ayush", LocalDate.of(2000, Month.AUGUST, 4), 21, "ayush@gmail.com"));
		}
	}
