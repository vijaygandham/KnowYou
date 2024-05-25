package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Integer>{
	
	@Query("select s from Schedule s where trainer_id=?1")
	public Schedule viewschedule(int tid);

}
