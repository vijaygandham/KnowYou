package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses_table")
public class Course 
{
	 @Id  
     @GeneratedValue
     private int id;
     @Column(nullable=false,unique=true)
     private String courseid;
     @Column(nullable=false,length=200)
     private String coursename;
     @Column(nullable=false)
     private String coursedescription;
     @Column(nullable=false,length=300)
     private String courselink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public String getCourselink() {
		return courselink;
	}
	public void setCourselink(String courselink) {
		this.courselink = courselink;
	}
   
}
