package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;

public class studentService {

    private static ArrayList<Student> students = new ArrayList<>();

    //add student
    public static void add_student(Student s){
        students.add(s);
    }

    //Search Student by ID
    public static Student findStudentById(int id) throws EntityNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new EntityNotFoundException("Student ID"+id+"was not found");
    }

    //deactivate student
    public static void remove_student(int id) throws EntityNotFoundException{
        Student s = findStudentById(id);
        s.setActive(false);
    }

    //update student email
    public static void update_student(int id, String email)throws EntityNotFoundException{
        Student s = findStudentById(id);
        s.setEmail(email);
        System.out.println("Email Address Updated!");
    }

    // list all students
    public static ArrayList<Student> listStudent(){
        return students;
    }


}
