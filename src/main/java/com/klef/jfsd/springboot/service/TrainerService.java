package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Schedule;
import com.klef.jfsd.springboot.model.Trainer;

public interface TrainerService {
	public Trainer addtrainer(Trainer trainer);

	public Trainer checktrainerlogin(String tname,String pwd);
	
    public Trainer viewtrainer(String tname);

    public Schedule addSchedule(Schedule schedule);
    
    public Schedule viewSchedule(int tid);
	
	public int changetrainerpassword(String traineroldpwd,String trainernewpwd,String tuname);
	
//	public int changeschedule(String startdate,String enddate,String venue,String time,int days,int tid);


}
