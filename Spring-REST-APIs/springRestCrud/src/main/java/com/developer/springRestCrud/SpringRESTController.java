package com.developer.springRestCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.developer.springRestCrud.entities.Student;
import com.developer.springRestCrud.services.StudentServices;

@RestController
@RequestMapping("/school")
public class SpringRESTController {
	
	@Autowired
	private StudentServices studserv;
	
	@GetMapping("/student/all")
	public List<Student> getAllStud()
	{
		return studserv.getAllStudents();
	}
	
	@GetMapping("/student/search/{studid}")
	public Student getStud(@PathVariable int studid)
	{
		return studserv.getStudent(studid);
	}
	
	@GetMapping("/student/search/gender/{gender}")
	public List<Student> getOnGen(@PathVariable String gender)
	{
		return studserv.getOnGender(gender);
	}
	
	@PostMapping("/student/add")
	public Student addStud(@RequestBody Student stud)
	{
		return studserv.addStudent(stud);
	}
	
	@PutMapping("/student/payfees")
	public String payFee(@RequestParam int studid,@RequestParam float amount)
	{
		String stat= studserv.payment(studid,amount);
		return stat;
	}
	
	@DeleteMapping("/student/remove")
	public String removeStud(@RequestParam int studid)
	{
		return studserv.removeStudent(studid);
	}

}
