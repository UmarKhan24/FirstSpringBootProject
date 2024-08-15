package com.student.details.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.details.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{


}
