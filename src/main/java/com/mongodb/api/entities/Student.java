package com.mongodb.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collation = "student_test")
public class Student {
	
	@Transient
	public static final String SEQUENCE_NAME = "student_test_sequence";
	
	@Id
	private Long id;

	private String name;

	private String college;

}
