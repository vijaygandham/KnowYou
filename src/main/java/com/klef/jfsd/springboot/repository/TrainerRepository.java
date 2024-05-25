package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer,Integer>{
	@Query("select t from Trainer t where username=?1 and password=?2")
	public Trainer checktrainerlogin(String uname,String pwd);
	
	@Query("select t from Trainer t where username=?1")
	public Trainer viewtrainer(String tname);
	
	@Transactional
	@Modifying
	@Query("update Trainer t set t.password=?1 where t.password=?2 and t.username=?3")
	public int updatetrainerpassword(String trainernewpwd,String traineroldpwd,String traineruname);
	
/*@Transactional
	@Modifying
	@Query("update Trainer t set t.startdate=?1,t.enddate=?2 ,t.venue=?3, t.time=?4 , t.days=?5 where t.id=?6")
	public int updateschedule(String startdate,String enddate,String venue,String time,int days,int tid);
*/
}
