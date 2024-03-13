package com.assignment.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
