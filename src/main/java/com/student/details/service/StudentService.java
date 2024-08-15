package com.student.details.service;

import org.springframework.stereotype.Service;

import com.student.details.entity.Student;

@Service
public interface StudentService {
	
	String createStudentInfo(Student st);
}
