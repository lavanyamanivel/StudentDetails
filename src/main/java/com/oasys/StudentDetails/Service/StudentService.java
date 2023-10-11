package com.oasys.StudentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.StudentDetails.Dao.StudentDao;
//import com.oasys.StudentDetails.Dao.Student;
import com.oasys.StudentDetails.Entity.Student;
import com.oasys.StudentDetails.Exception.AgeNotFoundException;

@Service

public class StudentService {
	@Autowired
	StudentDao studao;
	public Student agecheck(Student s)throws AgeNotFoundException {
		if(s.getAge()>=18) {
			return studao.agecheck(s);
			
		}
		else {
			throw new AgeNotFoundException("not eligible");
		}
	
	
	}
	
	
	

}
