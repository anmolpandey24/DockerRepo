package com.coforge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.coforge.entities.Student;
import com.coforge.repository.StudentRepository;

public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public List<Student> getAllStudents(){
		return repository.findAll();
	}

	public Optional<Student> getStudentById(int id) {
		
		return repository.findById(id);
	}
	
	public Student save(Student student) {
		return repository.save(student);
	}

}
