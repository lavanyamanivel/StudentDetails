package com.oasys.StudentDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oasys.StudentDetails.StudentApplication;
import com.oasys.StudentDetails.Entity.Student;
import com.oasys.StudentDetails.Exception.AgeNotFoundException;
import com.oasys.StudentDetails.Service.StudentService;

@RestController
@RequestMapping(value="/student")

public class StudentController {
	@Autowired
	StudentService stuser;
	@PostMapping(value="/age")
	public Student agecheck(@RequestBody Student s)throws AgeNotFoundException {
	return stuser.agecheck(s);
	

}
}



