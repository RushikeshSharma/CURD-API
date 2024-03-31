package com.developer.springRestCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.springRestCrud.entities.Student;
import com.developer.springRestCrud.repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository studrepo;
	
	
	public List<Student> getAllStudents()
	{
		List<Student> studlist= studrepo.findAll();
		return studlist;
	}
	
	public Student getStudent(int studid)
	{
		return studrepo.findByStudentid(studid);
	}
	
	public List<Student> getOnGender(String gender)
	{
		return studrepo.findByGender(gender);
	}
	
	public Student addStudent(Student stud)
	{
		return studrepo.save(stud);
	}
	
	public String payment(int studid,float amount)
	{
		Student stud=studrepo.findByStudentid(studid);
		stud.setFeespaid(stud.getFeespaid()+amount);
		stud.setFeesunpaid(stud.getFeesunpaid()-amount);
		studrepo.save(stud);
		return amount+"/-Rs paid successfully...Now "+stud.getFeesunpaid()+"/-Rs remaining...";
	}
	
	public String removeStudent(int studid)
	{
		Student stud = studrepo.findByStudentid(studid);
		String stat ="";
		if(stud!=null)
		{
			studrepo.delete(stud);
			stat="Successfully deleted...";
		}
		else {
			stat="Failed to delete...";
		}
		
		return stat;
	}

}
