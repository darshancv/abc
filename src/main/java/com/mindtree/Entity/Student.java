package com.mindtree.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Student")
public class Student {

	@Id
	@Column(name="student_id")
	private String studentId;
	@Column(name="StudentName")
	private String sname;
	@Column(name ="Age")
	private int age;
	@Column(name ="SubjectName")
	private String subject;
	
	@ManyToOne
	@JoinColumn(name="NAME")
	@JsonIgnore
	private College college;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentId, String sname, int age, String subject, College college) {
		super();
		this.studentId = studentId;
		this.sname = sname;
		this.age = age;
		this.subject = subject;
		this.college = college;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
