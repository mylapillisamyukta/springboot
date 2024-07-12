package com.project.crudoperations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudoperations.entity.Student;
import com.project.crudoperations.repository.studentRepository;

@Service
public class studentService {
	
	@Autowired
	studentRepository studentrepo;
	
	public String register(Student student) {
		studentrepo.save(student);
		return "success";
	}
	

}
