package com.klef.jfsd.springboot.model;

import javax.persistence.*;


@Entity
@Table(name="student_table")
public class Student 
{
  @Id
  @GeneratedValue 
  private int id;
  @Column(nullable=false,unique = true)
  private long student_id;
  @Column(nullable=false,length=200)
  private String name;
  @Column(nullable=false)
  private String gender;
  @Column(nullable=false)
  private String dob;
  @Column(nullable=false)
  private String department;
  @Column(nullable=false)
  private int year;
  @Column(nullable=false)
  private double cgpa;
  @Column(nullable=false)
  private int backlogs;
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


public String getName() {
  return name;
}


public String getGender() {
  return gender;
}


public String getDob() {
  return dob;
}


public String getDepartment() {
  return department;
}



public double getCgpa() {
  return cgpa;
}


public int getBacklogs() {
  return backlogs;
}


public String getEmailid() {
  return emailid;
}


public String getContactno() {
  return contactno;
}


public String getLocation() {
  return location;
}
public void setId(int id) {
	  this.id = id;
	}
	public void setName(String name) {
	  this.name = name;
	}
	public void setGender(String gender) {
	  this.gender = gender;
	}
	public void setDob(String dob) {
	  this.dob = dob;
	}
	public void setDepartment(String department) {
	  this.department = department;
	}
	public void setCgpa(double d) {
	  this.cgpa = d;
	}
	public void setBacklogs(int backlogs) {
	  this.backlogs = backlogs;
	}
	public void setEmailid(String emailid) {
	  this.emailid = emailid;
	}
	public void setContactno(String contactno) {
	  this.contactno = contactno;
	}
	public void setLocation(String location) {
	  this.location = location;
	}


	public long getStudent_id() {
		return student_id;
	}


	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
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

}