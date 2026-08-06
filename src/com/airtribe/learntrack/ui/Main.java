package com.airtribe.learntrack.ui;

/* Menu or Console UI */

import com.airtribe.learntrack.service.courseService;
import com.airtribe.learntrack.service.enrollmentService;
import com.airtribe.learntrack.service.studentService;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        // creating objects for services

        studentService stud_service = new studentService(); //student service

        courseService course_service = new courseService(); //course service

        enrollmentService enroll_service = new enrollmentService(); //enrollment service

        boolean running = true;

        while(running){
            printMenu();

            try{
                System.out.println("Enter your Choice");
                int choice = Integer.parseInt(scn.nextLine());

                switch(choice){
//                    case 1:
//                        add_student();
//                        break;
//
//                    case 2:
//                        view_student();
//                        break;

                    case 0:
                        running = false;
                        System.out.println("Program Ended !!!");
                        break;
                    default:
                        System.out.println("INVALID OPTION");
                }
            }
            catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }

        }




    }

    public static void printMenu(){
        System.out.println("Welcome to Learn Track");

        //Student Operation
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Search Student");
        System.out.println("4. Deactivate Student");

        //Courses
        // these below features are not implement yet.
//        System.out.println("5. Add Course");
//        System.out.println("6. View Courses");
//        System.out.println("7. Activate Course");
//        System.out.println("8. Deactivate Course");
//
//        //Enrollment
//        System.out.println("9. Enroll Student");
//        System.out.println("10. View Enrollments");
//        System.out.println("11. Complete Enrollement");
//        System.out.println("12. Cancel Enrollment");

        System.out.println("0. Exit");
    }
}
