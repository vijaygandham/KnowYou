package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String>
{
	@Query("select a from Admin a where username=?1 and password=?2")
	public Admin checkadnminlogin(String uname,String pwd);
	
	@Transactional
	@Modifying
	@Query("update Admin a set a.password=?1 where a.password=?2 and a.username=?3")
	public int updateadminpassword(String adminnewpwd,String adminoldpwd,String adminuname);
	@Query("select count(s) from Student s")
	public long count();
}
