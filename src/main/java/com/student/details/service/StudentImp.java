package com.student.details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.details.entity.Student;
import com.student.details.repo.StudentRepository;

@Component
public class StudentImp implements StudentService {
	
	@Autowired
	StudentRepository strep;
	
	@Override
	public String createStudentInfo(Student st) {
		Student student = new Student();
		student.setId(st.getId());
		student.setName(st.getName());
		student.setAge(st.getAge());
//		student.setPhoneNumber(st.getPhoneNumber());
		student.setAddress(st.getAddress());
		
		strep.save(student);
		
		return "Record created successfully";
	}

}
