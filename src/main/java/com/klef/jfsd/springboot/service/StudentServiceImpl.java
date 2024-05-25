package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addstudent(Student student)
	{
		return studentRepository.save(student);
		
	}

	@Override
	public Student checkstudentlogin(String uname, String pwd) {
		return studentRepository.checkstudentlogin(uname, pwd);
	}

	@Override
	public Student viewstudent(String uname) {
		return studentRepository.viewstudent(uname);
	}

	@Override
	public int changestudentpassword(String studentoldpwd, String studentnewpwd, String suname) {
		
		return studentRepository.updatestudentpassword(studentnewpwd, studentoldpwd, suname);
	}

}
