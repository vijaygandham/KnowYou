package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.klef.jfsd.springboot.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	@Query("select s from Student s where username=?1 and password=?2")
	public Student checkstudentlogin(String uname,String pwd);
	
	@Query("select s from Student s where username=?1")
	public Student viewstudent(String uname);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.password=?1 where s.password=?2 and s.username=?3")
	public int updatestudentpassword(String studentnewpwd,String studentoldpwd,String studentuname);

}
