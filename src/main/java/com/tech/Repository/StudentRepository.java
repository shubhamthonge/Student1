package com.tech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
