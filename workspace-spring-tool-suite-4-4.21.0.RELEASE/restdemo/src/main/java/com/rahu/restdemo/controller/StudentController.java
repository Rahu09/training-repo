package com.rahu.restdemo.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rahu.restdemo.bean.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {
	
	@GetMapping(path = "/getStudent")
	public ResponseEntity<Student> getStudent() {
		return new ResponseEntity<>(new Student(0, "rahul", "tiwari"),HttpStatus.OK);
	}
	
	@GetMapping(path = "/getStudentlist")
	public ResponseEntity<List<Student>> getStudentlist() {
		
		java.util.List<Student> myList = new ArrayList<>();
		myList.add(new Student(1, "rahul", "tiwari"));
		myList.add(new Student(2, "raj", "tiwari"));
		myList.add(new Student(3, "ritu", "tiwari"));
		
		return new ResponseEntity<>( myList,HttpStatus.OK);
	}
	
	@GetMapping(path = "/getStudentbyid/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		Student result =null;
		
		java.util.List<Student> myList = new ArrayList<>();
		myList.add(new Student(1, "rahul", "tiwari"));
		myList.add(new Student(2, "raj", "tiwari"));
		myList.add(new Student(3, "ritu", "tiwari"));
		
		for(Student s:myList) {
			if(id==s.getId()) {
				result = s;
			}
		}
		
		return result;
	}
	
	@GetMapping(path = "/getStudentusingsuppliedargs/{id}/{fname}/{lname}")
	public Student getStudentusingsuppliedargs(@PathVariable("id") int studentId, @PathVariable("fname") String firstname,@PathVariable("lname") String lastname) {
		
		return (new Student(studentId, firstname, lastname));
	}
	
	@GetMapping(path = "/getStudentbyidreqparam")
	public Student getStudentByIdReqParam(@RequestParam("id") int id) {
		
		Student result =null;
		
		java.util.List<Student> myList = new ArrayList<>();
		myList.add(new Student(1, "rahul", "tiwari"));
		myList.add(new Student(2, "raj", "tiwari"));
		myList.add(new Student(3, "ritu", "tiwari"));
		
		for(Student s:myList) {
			if(id==s.getId()) {
				result = s;
			}
		}
		
		return result;
	}
	
	@GetMapping(path = "/getStudentusingsuppliedparam")
	public Student getStudentusingsuppliedparam(@RequestParam(required = false) int opt, @RequestParam(name="id") int studentId, @RequestParam("fname") String firstname,@RequestParam("lname") String lastname) {
		
		return (new Student(studentId, firstname, lastname));
	}
	
	@PostMapping(path = "/saveStudent")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createdStudent(@RequestBody Student s) {
		System.out.println(s);
		return s;
		
	}
	
	@PutMapping(path = "/updatestudent/{id}")
	public ResponseEntity<List<Student>> updateStudent(@PathVariable int id, @RequestBody Student s) {
		
		java.util.List<Student> myList = new ArrayList<>();
		
		myList.add(new Student(1, "rahul", "tiwari"));
		myList.add(new Student(2, "raj", "tiwari"));
		myList.add(new Student(3, "ritu", "tiwari"));
		
		for(Student st:myList) {
			if(id==st.getId()) {
				st.setFirstName(s.getFirstName());
				st.setLastName(s.getLastName());
				break;
			}
		}
		return new ResponseEntity<List<Student>>(myList,HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/deletestudent/{id}")
	public ResponseEntity<List<Student>> deleteStudent(@PathVariable int id) {
		
		java.util.List<Student> myList = new ArrayList<>();
		
		myList.add(new Student(1, "rahul", "tiwari"));
		myList.add(new Student(2, "raj", "tiwari"));
		myList.add(new Student(3, "ritu", "tiwari"));
		
		for(Student st:myList) {
			if(id==st.getId()) {
				myList.remove(st);
				break;
			}
		}
		return new ResponseEntity<List<Student>>(myList,HttpStatus.OK);
	}
}
