package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courseallocation_table")
public class CourseAllocation {
	
	
	@GeneratedValue
	private int allocation_id;
	@Id	
	@Column(nullable = false,unique = true)
	private int trainer_id;
	@Column(nullable = false)
	private int course_id;

	public int getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getAllocation_id() {
		return allocation_id;
	}

	public void setAllocation_id(int allocation_id) {
		this.allocation_id = allocation_id;
	}

}
