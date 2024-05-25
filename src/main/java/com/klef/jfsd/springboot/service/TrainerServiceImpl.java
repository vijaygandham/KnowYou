package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Schedule;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.repository.ScheduleRepository;
import com.klef.jfsd.springboot.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService{
	@Autowired
	private TrainerRepository trainerRepository;
	 @Autowired
	private ScheduleRepository scheduleRepository;
	@Override
	public Trainer addtrainer(Trainer trainer)
	{
		return trainerRepository.save(trainer);
		
	}

	@Override
	public Trainer checktrainerlogin(String uname, String pwd) {
		return trainerRepository.checktrainerlogin(uname, pwd);
	}

	@Override
	public int changetrainerpassword(String traineroldpwd, String trainernewpwd, String tuname) {
		return trainerRepository.updatetrainerpassword(trainernewpwd, traineroldpwd, tuname);
	}

	@Override
	public Trainer viewtrainer(String tname) {
		return trainerRepository.viewtrainer(tname);
	}

	@Override
	public Schedule addSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return scheduleRepository.save(schedule);
	}

	@Override
	public Schedule viewSchedule(int tid) {
		// TODO Auto-generated method stub
		return scheduleRepository.viewschedule(tid);
	}
}
