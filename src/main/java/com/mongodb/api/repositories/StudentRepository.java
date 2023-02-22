package com.mongodb.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.api.entities.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

}
