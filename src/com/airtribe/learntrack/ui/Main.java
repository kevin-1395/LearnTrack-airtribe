package com.airtribe.learntrack.ui;

/* Menu or Console UI */

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.service.courseService;
import com.airtribe.learntrack.service.enrollmentService;
import com.airtribe.learntrack.service.studentService;
import com.airtribe.learntrack.utility.IdGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    private static final studentService studentService = new studentService();
    private static final courseService courseService = new courseService();
    private static final enrollmentService enrollmentService = new enrollmentService();

    public static void main(String[] args) {


        boolean running = true;

        while(running){
            printMenu();

            try{
                System.out.println("Enter your Choice");
                int choice = Integer.parseInt(scn.nextLine());

                switch(choice){
                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        deactivateStudent();
                        break;

                    case 5:
                        addCourse();
                        break;

                    case 6:
                        viewCourses();
                        break;

                    case 7:
                        activateCourse();
                        break;

                    case 8:
                        deactivateCourse();
                        break;

                    case 9:
                        enrollStudent();
                        break;

                    case 10:
                        viewEnrollments();
                        break;

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
        System.out.println("5. Add Course");
        System.out.println("6. View Courses");
        System.out.println("7. Activate Course");
        System.out.println("8. Deactivate Course");
////
//        //Enrollment
        System.out.println("9. Enroll Student");
        System.out.println("10. View Enrollments");
//        System.out.println("11. Complete Enrollement");
//        System.out.println("12. Cancel Enrollment");

        System.out.println("0. Exit");
    }

    private static void addStudent(){
        System.out.print("First Name: ");
        String firstName = scn.nextLine();

        System.out.print("Last Name: ");
        String lastName = scn.nextLine();

        System.out.print("Email: ");
        String email = scn.nextLine();

        System.out.print("Batch: ");
        String batch = scn.nextLine();

        Student student = new Student(

                IdGenerator.getStudentIdCounter(),
                firstName,
                lastName,
                email,
                batch,
                true
        );

        studentService.add_student(student);

        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {

        for (Student student :
                studentService.listStudent()) {

            System.out.println(student);
        }
    }

    private static void searchStudent(){

        System.out.print("Enter student ID: ");
        try {
            int id = Integer.parseInt(
                    scn.nextLine()
            );

            Student student =
                    studentService.findStudentById(id);

            System.out.println(student);
        }
        catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void deactivateStudent() {

        System.out.print("Enter student ID: ");
        try {
                int id = Integer.parseInt(
                        scn.nextLine()
                );

                studentService.remove_student(id);

                System.out.println(
                        "Student deactivated successfully.");
        }
        catch (EntityNotFoundException e){System.out.println(e.getMessage());}
    }

    // ----------- COURSE --------------

    private static void addCourse() {

        System.out.print("Course name: ");
        String name = scn.nextLine();

        System.out.print("Description: ");
        String description = scn.nextLine();

        System.out.print("Duration (weeks): ");

        int duration = Integer.parseInt(
                scn.nextLine()
        );

        Course course = new Course(

                IdGenerator.getNextCourseId(),
                name,
                description,
                duration,
                true
        );

        courseService.add_Course(course);

        System.out.println("Course added successfully.");
    }

    private static void viewCourses() {

        for (Course course : courseService.getAllCourses()) {

            System.out.println(course);
        }
    }

    private static void activateCourse(){

        System.out.print("Enter course ID: ");
        int id = Integer.parseInt(scn.nextLine());
        try{
            courseService.activate_Course(id);

            System.out.println("Course activated.");}
        catch (EntityNotFoundException e){System.out.println(e.getMessage());}
    }

    private static void deactivateCourse() {

        System.out.print("Enter course ID: ");
        int id = Integer.parseInt(scn.nextLine());
        try {
            courseService.deactivate_Course(id);

            System.out.println("Course deactivated.");
        }
        catch (EntityNotFoundException e){System.out.println(e.getMessage());}
    }

    // Enrollment

    private static void enrollStudent(){

        System.out.print("Student ID: ");
        int studentId = Integer.parseInt(scn.nextLine());

        System.out.print("Course ID: ");
        int courseId = Integer.parseInt(scn.nextLine());
        try {
            // Validate IDs
            studentService.findStudentById(studentId);
            courseService.findCourseById(courseId);

            Enrollment enrollment = new Enrollment(
                    IdGenerator.getEnrollmentIdCounter(),
                    studentId,
                    courseId,
                    LocalDate.now().toString(),
                    "ACTIVE"
            );

            enrollmentService.enrollStudent(enrollment);
            System.out.println("Enrollment successfully");
        }
        catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }
        }

    private static void viewEnrollments() {
        System.out.println("\n--- Student Enrollments ---");
        System.out.print("Enter student ID: ");
        int studentId = Integer.parseInt(scn.nextLine());
        ArrayList<Enrollment> studentEnrollments = enrollmentService.getEnrollmentsByStudentId(studentId);
        if (studentEnrollments.isEmpty())
        {
            System.out.println( "No enrollments found for student ID: " + studentId );
            return;
        }
        for (Enrollment enrollment : studentEnrollments)
        {
            System.out.println(enrollment);
        }
    }


}
