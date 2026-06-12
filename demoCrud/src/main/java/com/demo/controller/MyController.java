package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.entity.Course;
import com.demo.service.courseService;

@RestController
public class MyController {

    @Autowired
    private courseService cs;

    @GetMapping("/home")
    public String home() {
        return "Welcome to Course Application";
    }

    // Get all courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.cs.getCourse();
    }

    // Get course by ID
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.cs.getcourse(Long.parseLong(courseId));
    }

    // Add new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.cs.addcourse(course);
    }

    // Update course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.cs.updatecourse(course);
    }

    // Delete course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.cs.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}