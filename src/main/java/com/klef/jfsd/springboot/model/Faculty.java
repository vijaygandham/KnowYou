package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_table")
public class Faculty {
	
   @Id	
   @GeneratedValue
   private int id;
   @Column(nullable=false,unique=true)
   private long faculty_id;
   @Column(nullable=false,length=200)
   private String name;
   @Column(nullable=false)
   private String gender;
   @Column(nullable=false)
   private String dob;
   @Column(nullable=false)
   private String department;
   @Column(nullable=false)
   private String qualification;
   @Column(nullable=false)
   private String designation;
   @Column(nullable=false)
   private double experience;
   @Column(nullable=false,length=200,unique=true)
   private String emailid;
   @Column(nullable=false,unique=true)
   private String username;
   @Column(nullable=false,unique=true)
   private String password;
   @Column(nullable=false,length=100,unique=true)
   private String contactno;
   @Column(nullable=false,length=200)
   private String location;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getFaculty_id() {
	return faculty_id;
}
public void setFaculty_id(long faculty_id) {
	this.faculty_id = faculty_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getExperience() {
	return experience;
}
public void setExperience(double experience) {
	this.experience = experience;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
   
   
}
