package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Service.StudentService;
import com.tech.dto.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/getall")
	public List<Student> getall( ) {
	System.out.println("inside StudentController gatall");
	List<Student> sl=studentService.getall();
	return sl;	
	}
}
