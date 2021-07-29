package com.mindtree.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Entity.College;
import com.mindtree.Entity.Student;
import com.mindtree.Service.CollegeManagementService;



@RestController
public class CollegeController {
	
	@Autowired
	private CollegeManagementService collegeManagementService;
	
	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college)
	{
		return collegeManagementService.addCollege(college);
		
	}
	@GetMapping("/getCollege")
	public List<College> getAllColleges()
	{
		return collegeManagementService.getAllColleges();
	}
	
	@PostMapping("/addStudent/{collegeName}")
	public Student addStudent(@RequestBody Student student,@PathVariable String collegeName)
	{
		return collegeManagementService.addStudent(student,collegeName);
		
	}
	@GetMapping("/getStudent")
	public List<Student> getAllStudents()
	{
		return collegeManagementService.getAllStudent();
	}
}
