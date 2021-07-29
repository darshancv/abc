package com.mindtree.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.Entity.College;
import com.mindtree.Entity.Student;
import com.mindtree.Repository.CollegeRepository;
import com.mindtree.Repository.StudentRepository;

import java.util.List;

@Service
public class CollegeManagementService {

	@Autowired
	private CollegeRepository collegeRepository;

	@Autowired
	private StudentRepository studentRepository;

	public College addCollege(College college) {
		return collegeRepository.save(college);

	}

	public List<College> getAllColleges() {
		return collegeRepository.findAll();
	}

	public Student addStudent(Student student, String collegeName) {
		College college = collegeRepository.findById(collegeName).get();
		
		student.setCollege(college);

		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();

	}

}
