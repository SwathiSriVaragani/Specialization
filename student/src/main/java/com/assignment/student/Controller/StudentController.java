package com.assignment.student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.student.Entity.Student;
import com.assignment.student.Service.StudentService;
@RequestMapping("/Details")
@RestController
public class StudentController {  
	
	@Autowired
	StudentService studentservice; 
	
	@PostMapping("/addbook")
	public String AddingStudent(@RequestBody Student student) { 
		studentservice.addStudent(student); 
		return "Student is added Successfully";
		
	}
	@GetMapping("/{id}")
	public Optional<Student> GettingStudentInfoById(@PathVariable long Student_Id) {
		return studentservice.getStudent(Student_Id);
	}
	@GetMapping("/all")
	public List<Student> GettingAllStudentDetails(){ 
		return studentservice.getStudents();
		
	} 
	@PostMapping("/updatebook")
	public String UpdatingStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
		return "Student is updated Succesfully";
	} 
	@RequestMapping("/{delid}")
	public String DeletingStudent(@PathVariable long Student_Id) {
		studentservice.deleteStudent(Student_Id); 
		return "Deleted Successfully";
	}
	

}
