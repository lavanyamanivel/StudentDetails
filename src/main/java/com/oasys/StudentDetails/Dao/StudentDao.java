package com.oasys.StudentDetails.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.StudentDetails.Entity.Student;
import com.oasys.StudentDetails.Exception.AgeNotFoundException;
import com.oasys.StudentDetails.Repository.StudentRepository;

@Repository

public class StudentDao {
	@Autowired
	StudentRepository sturep;
	public Student agecheck(Student a) {
		return sturep.save(a);
	}
}