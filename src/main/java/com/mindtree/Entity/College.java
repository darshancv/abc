package com.mindtree.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	
	
	@Id
	@Column(name = "NAME")
	private String name;
	@Column(name ="StudentStrength")
	private int strength;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy = "college")
	private List<Student> students;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	


	
	
}
