package com.assignment.student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.student.Entity.Student;
import com.assignment.student.Repository.StudentRepository;

@Service
public class StudentService { 
	
	@Autowired
	StudentRepository studentrepo;
	
	
	public void addStudent(Student student) { 
		studentrepo.save(student);	
	}
	public Optional<Student> getStudent(long Student_Id) {
		return studentrepo.findById(Student_Id);
	}
	public List<Student> getStudents(){
		return studentrepo.findAll();
	}
	public void deleteStudent(long Student_Id) {
		studentrepo.deleteById(Student_Id);
		
	}
	public void updateStudent(Student student) {
		studentrepo.save(student);
	}
	
	

}
