package com.hcl.springbootstudentserviceresttemplate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.springbootstudentserviceresttemplate.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/all")
	public List<Student> getAll(){
		
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1L);
		//student.setFirstName("fname1");
		//student.setLastName("lname1");
		students.add(student);

		student = new Student();
		student.setId(2L);
		//student.setFirstName("fname2");
		//student.setLastName("lname2");
		students.add(student);
		
		return students;
		
	}
	
	@PostMapping("/test2")
	public String getTests(@RequestParam String email){
		
		
		
		return email;
		
	}
	
	
	
	@PostMapping("/test5")
	public ResponseEntity<Student> getTest5(@RequestBody Student student) throws JsonProcessingException{
		
		/*
		 * Student student1 = new Student(); student.setId(student.getId());
		 * student.setFirstName(name); student.setAddress(address);
		 */
		ObjectMapper Obj = new ObjectMapper(); 
		
		Obj.writeValueAsString(student);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
}
