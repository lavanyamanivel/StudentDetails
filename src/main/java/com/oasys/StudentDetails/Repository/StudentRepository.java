package com.oasys.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.StudentDetails.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}


