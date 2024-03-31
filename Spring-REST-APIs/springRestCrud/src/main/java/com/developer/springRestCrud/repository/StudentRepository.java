package com.developer.springRestCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.springRestCrud.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	Student findByStudentid(int studid);
	List<Student> findByGender(String gender);

}
