package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CourseDao;
import com.demo.entity.Course;

@Service
public class courseServiceIMPL implements courseService {
	@Autowired
	private CourseDao coursedao;
	@Override
	public List<Course> getCourse()
	{
		return coursedao.findAll();
	}
	@Override
	public Course getcourse(long courseId) {
		return coursedao.findById(courseId).get();
	}
	@Override
	public Course addcourse(Course course)
	{
		coursedao.save(course);
		return course;
	}
	public Course updatecourse(Course course)
	{
		coursedao.save(course);
		return course;
	}
	public void deleteCourse(long parseLong) {
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}
	
	
}