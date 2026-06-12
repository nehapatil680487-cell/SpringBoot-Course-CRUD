package com.demo.service;

import java.util.List;

import com.demo.entity.Course;

public interface courseService {
public List<Course> getCourse();

	public Course getcourse(long courseId);
	
	public Course addcourse(Course course);
	
	public Course updatecourse(Course course);
	
	public void deleteCourse(long parseLong);

	
}
