package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;

public class enrollmentService {

    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    //enroll new student
    public void enrollStudent(Enrollment new_enroll){
        enrollments.add(new_enroll);
        System.out.println("Enrolled success!");
    }

    //View Enrollements
    public ArrayList<Enrollment> viewEnrollments(){
        return enrollments;
    }

    //find enrollment by ID
    public Enrollment findEnrollById(int id)throws EntityNotFoundException {
        for(Enrollment e: enrollments){
            if (e.getId() == id){
                return e;
            }
        }
        throw new EntityNotFoundException("Enrollement ID"+id+"was not found");
    }

    public void completeEnrollment(int id)throws EntityNotFoundException{
        Enrollment e = findEnrollById(id);
        e.setStatus("Completed");
        System.out.println("Enrollment completed");
    }

    public void cancelEnrollment(int id)throws EntityNotFoundException{
        Enrollment e = findEnrollById(id);
        e.setStatus("Cancelled");
        System.out.println("Enrollement Cancelled!");
    }
}
