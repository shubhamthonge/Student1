package com.tech.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Repository.StudentRepository;
import com.tech.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getall() {
		System.out.println("inside StudentService getall");
		List<Student> sl = studentRepository.findAll();
		System.out.println("student info"+sl);
		return sl;
		

	}

}
