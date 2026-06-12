package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course,Long> {
		

}