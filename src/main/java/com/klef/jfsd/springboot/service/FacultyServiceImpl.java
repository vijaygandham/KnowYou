package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService{
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Override
	public Faculty addfaculty(Faculty faculty)
	{
		return facultyRepository.save(faculty);
		
	}

	@Override
	public Faculty checkfacultylogin(String uname, String pwd) {
		return facultyRepository.checkfacultylogin(uname, pwd);
		
	}

	@Override
	public Faculty viewfaculty(String uname) {
		return facultyRepository.viewfaculty(uname);
	}

	@Override
	public int changefacultypassword(String facultyoldpwd, String facultynewpwd, String funame) {
		return facultyRepository.updatefacultypassword(facultynewpwd, facultyoldpwd, funame);
	}

}
