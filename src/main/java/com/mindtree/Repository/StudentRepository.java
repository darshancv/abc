package com.mindtree.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	

}
