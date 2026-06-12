package com.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {
	@Id
	private long id;
	private String title;
	private String description;
	public Course() {
		super();
	}
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Course [Course Id=" + id + ", Title=" + title + ", Description=" + description + "]"; 
	}
	public Object findById(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public void save(Course course) {
		// TODO Auto-generated method stub
		
	}

}
