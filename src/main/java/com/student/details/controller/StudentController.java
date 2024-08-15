
package com.student.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.details.entity.Student;
import com.student.details.service.StudentImp;

@RestController
public class StudentController {

@Autowired
StudentImp stimp;

	@PostMapping(value="/createStudent")
	public String createStudentDetails(@RequestBody Student st) {
			String message=stimp.createStudentInfo(st);
		return message;
	}

}
