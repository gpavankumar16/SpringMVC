package com.pavan.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {
	
	@Pattern(regexp="[^0-9]*") 
	private String studentName;
	@Size(min=2, max=10) @IsValidHobby
	private String studentHobby;
	@Past
	private Date joiningDate;
	private List<String> courseList;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public List<String> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<String> courseList) {
		this.courseList = courseList;
	}
	

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	
	
	

}
