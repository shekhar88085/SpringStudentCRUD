package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class studentService {
		private final StudentRepository studentRepository;
		public studentService(StudentRepository studentRepository) {
			super();
			this.studentRepository = studentRepository;
		}
		public List<Student> getStudents() {
		return studentRepository.findAll();
		}
	}
