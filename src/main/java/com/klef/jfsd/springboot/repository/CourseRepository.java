package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer>{

	@Query("select c from Course c where id=?1")
	public Course viewcourse(int id);
}
