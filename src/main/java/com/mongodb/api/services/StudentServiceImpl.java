package com.mongodb.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.api.entities.Student;
import com.mongodb.api.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		Student saveStudent= studentRepository.save(student);
		 return saveStudent;
	}

	@Override
	public Student getByStudentId(Long id) {
		Optional<Student> getStudent = studentRepository.findById(id);
		if(getStudent.isPresent()) {
			return getStudent.get();
		}else {
			throw new RuntimeException("Employee not found with id "+id);
		}
	}

	@Override
	public void deleteByStudentId(Long id) {
		Optional<Student> getStudent = studentRepository.findById(id);
		studentRepository.delete(getStudent.get());
		
	}

}
