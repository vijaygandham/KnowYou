package com.klef.jfsd.springboot.service;


import com.klef.jfsd.springboot.model.Student;

public interface StudentService {

	public Student addstudent(Student student);
	public Student checkstudentlogin(String uname,String pwd);
	public Student viewstudent(String uname);
	

	public int changestudentpassword(String studentoldpwd,String studentnewpwd,String suname);


}
