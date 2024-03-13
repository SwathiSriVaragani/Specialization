package com.assignment.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Student { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long Student_Id;
	private String Student_Name; 
	private int Student_Age;
	private String Student_Specialization;
	
	
	public long getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(long student_Id) {
		Student_Id = student_Id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getStudent_Age() {
		return Student_Age;
	}
	public void setStudent_Age(int student_Age) {
		Student_Age = student_Age;
	}
	public String getStudent_Specialization() {
		return Student_Specialization;
	}
	public void setStudent_Specialization(String student_Specialization) {
		Student_Specialization = student_Specialization;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long student_Id, String student_Name, int student_Age, String student_Specialization) {
		super();
		Student_Id = student_Id;
		Student_Name = student_Name;
		Student_Age = student_Age;
		Student_Specialization = student_Specialization;
	}
	@Override
	public String toString() {
		return "Student [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Student_Age=" + Student_Age
				+ ", Student_Specialization=" + Student_Specialization + "]";
	}
	
	

}
