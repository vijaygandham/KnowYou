package com.klef.jfsd.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Course;
import com.klef.jfsd.springboot.model.CourseAllocation;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.CourseAllocationRepository;
import com.klef.jfsd.springboot.repository.CourseRepository;
import com.klef.jfsd.springboot.repository.FacultyRepository;
import com.klef.jfsd.springboot.repository.StudentRepository;
import com.klef.jfsd.springboot.repository.TrainerRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private FacultyRepository facultyRepository;
	@Autowired
	private TrainerRepository trainerRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private CourseAllocationRepository caRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		return adminRepository.checkadnminlogin(uname, pwd);
	}



	@Override
	public int changeadminpassword(String adminoldpwd, String adminnewpwd, String auname) {
		
		return adminRepository.updateadminpassword(adminnewpwd, adminoldpwd, auname);
	}



	@Override
	public List<Student> viewallstudents() {
		return (List<Student>) studentRepository.findAll();
	}



	@Override
	public List<Faculty> viewallfaculty() {
		return (List<Faculty>) facultyRepository.findAll();
	}



	@Override
	public List<Trainer> viewallTrainer() {
		return (List<Trainer>) trainerRepository.findAll();
	}



	@Override
	public void deletestudent(int id) {
		studentRepository.deleteById(id);
		
	}



	@Override
	public Student viewstudentbyid(int id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public void deletefaculty(int id) {
		facultyRepository.deleteById(id);
		
	}



	@Override
	public Faculty viewfacultybyid(int id) {
		return facultyRepository.findById(id).get();
	}



	@Override
	public void deletetrainer(int id) {
		trainerRepository.deleteById(id);
		
	}



	@Override
	public Trainer viewtrainerbyid(int id) {
		return trainerRepository.findById(id).get();
	}



	@Override
	public long facultycount() {
		return facultyRepository.count();
	}



	@Override
	public long studentcount() {
		// TODO Auto-generated method stub
		return studentRepository.count();
	}



	@Override
	public long trainercount() {
		// TODO Auto-generated method stub
		return trainerRepository.count();
	}



	@Override
	public List<Course> viewallCourses() {
		
		 return (List<Course>) courseRepository.findAll();
	}



	@Override
	public CourseAllocation allocatecourse(CourseAllocation ca) {
		// TODO Auto-generated method stub
		return caRepository.save(ca);
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}



	@Override
	public long coursecount() {
		// TODO Auto-generated method stub
		return courseRepository.count();
	}



	@Override
	public CourseAllocation viewcoursebyid(int id) {
		// TODO Auto-generated method stub
		return caRepository.findById(id).get();
	}



	@Override
	public Trainer viewbyuname(String username) {
		// TODO Auto-generated method stub
		return trainerRepository.viewtrainer(username);
	}



	@Override
	public Course viewcoursesbyid(int id) {
		// TODO Auto-generated method stub
		 return courseRepository.findById(id).get();
	}

}
