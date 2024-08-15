package com.student.details.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
//	private long phoneNumber;
	private String address;

}
