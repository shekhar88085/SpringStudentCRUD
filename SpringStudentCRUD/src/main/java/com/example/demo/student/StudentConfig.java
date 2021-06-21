package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args->{
			Student mariamStudent=new Student(1L, "Ayush", LocalDate.of(2000, Month.AUGUST, 4), 21, "ayush@gmail.com");
		
		Student marryStudent=new Student(2L, "marry", LocalDate.of(2000, Month.AUGUST, 4), 21, "marry@gmail.com");
	repository.saveAll(List.of(mariamStudent,marryStudent));
	};
	};
	}
