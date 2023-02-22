package com.mongodb.api.services;

import java.util.List;

import com.mongodb.api.entities.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student saveStudent(Student student);

	Student getByStudentId(Long id);

	void deleteByStudentId(Long id);

}
