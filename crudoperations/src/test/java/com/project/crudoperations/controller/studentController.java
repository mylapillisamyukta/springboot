package com.project.crudoperations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.crudoperations.entity.Student;
import com.project.crudoperations.repository.studentRepository;
import com.project.crudoperations.service.studentService;

@Controller
@RestController
@RequestMapping("/api/student")
public class studentController {
	
	@Autowired
	studentService studentser;
           
	@Autowired
	studentRepository studentrepo;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Student student) {
		if(studentser.register(student) !=null) {
			return ResponseEntity.ok("registration success");
		}
	    return ResponseEntity.ok("register failed");
	}
	}

	
