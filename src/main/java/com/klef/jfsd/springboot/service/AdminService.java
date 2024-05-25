package com.klef.jfsd.springboot.service;
import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.CourseAllocation;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Trainer;


public interface AdminService
{
	public Admin checkadminlogin(String uname,String pwd);

	public List<Student> viewallstudents();
	
	public List<Faculty> viewallfaculty();
	
	public List<Trainer> viewallTrainer();
	
	public List<Course> viewallCourses();
	
	public void deletestudent(int id);
	
	public void deletefaculty(int id);
	
	public void deletetrainer(int id);
	
	public Student viewstudentbyid(int id);
	
	public Faculty viewfacultybyid(int id);
	
	public Trainer viewtrainerbyid(int id);
	
	public Course viewcoursesbyid(int id);
	
	public Trainer viewbyuname(String username);
	
	public CourseAllocation viewcoursebyid(int id);
	
	public int changeadminpassword(String adminoldpwd,String adminnewpwd,String auname);
	
	public long facultycount();
	
	public long studentcount();
	
	public long trainercount();
	
	public long coursecount();
	
	public CourseAllocation allocatecourse(CourseAllocation ca);
	
	public Course addCourse(Course course);
}
 