package com.mindtree.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.Entity.College;



@Repository
public interface CollegeRepository extends JpaRepository<College, String>{

}
