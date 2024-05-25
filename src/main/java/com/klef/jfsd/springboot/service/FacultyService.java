package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Faculty;

public interface FacultyService {
	public Faculty addfaculty(Faculty faculty);
	public Faculty checkfacultylogin(String uname,String pwd);
	
    public Faculty viewfaculty(String uname);
	

	public int changefacultypassword(String facultyoldpwd,String facultynewpwd,String funame);


}
