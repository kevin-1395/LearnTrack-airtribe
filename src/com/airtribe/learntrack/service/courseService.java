package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;

public class courseService {

    private static ArrayList<Course> courses = new ArrayList<>();

    //add Course
    public static void add_Course(Course course){
        courses.add(course);
        System.out.println("Course Added !");
    }

    //get all the courses
    public static ArrayList<Course> list_Courses(){
        return courses;
    }

    //find course by ID
    public static Course findCourseById(int id) throws EntityNotFoundException {
        for (Course c: courses){
            if(c.getId() == id){
                return c;
            }
        }
        throw new EntityNotFoundException("Course ID"+id+"was not found");
    }

    // View all courses
    public static ArrayList<Course> getAllCourses() {
        return courses;
    }

    public static void activate_Course(int id)throws EntityNotFoundException{
        Course c = findCourseById(id);
        c.setActive(true);
        System.out.println("Course Activated!");
    }

    public static void deactivate_Course(int id)throws EntityNotFoundException {
        Course c = findCourseById(id);
        c.setActive(false);
        System.out.println("Course deactivated!");
    }

}
