# Learn Track

### Project Description 

LearnTrack is a console-based Student and Course Management System developed using Core Java.
The application allows administrators to manage:

**Students**

**Courses**

**Enrollments**

---

### Features

#### Student Management
- Add a new student
- View all students
- Search for a student by ID
- Deactivate a student

#### Course Management
- Add a new course
- View all courses
- Activate or deactivate a course

#### Enrollment Management
- Enroll a student in a course
- View enrollments for a student
- Mark an enrollment as completed
- Cancel an enrollment
----

### Project Structure 

com.airtribe.learntrack
├── entity
│   ├── Person.java
│   ├── Student.java
│   ├── Course.java
│   └── Enrollment.java
│
├── service
│   ├── StudentService.java
│   ├── CourseService.java
│   └── EnrollmentService.java
│
├── exception
│   ├── EntityNotFoundException.java
│
├── utility
│   └── IdGenerator.java
│
├── ui
│   └── Main.java
│
└── docs
├── Setup_Instructions.md
├── JVM_Basics.md
└── Design_Notes.md
└── README.md

------
### Requirements 
- Java JDK 17 or higher
- IDE - IntellIJ/ VS code

-----

### How to compile the Project

Open terminal from source directory (src folder)
First we must compile all the jave files 

javac com/airtribe/learntrack/entity/*.java \
com/airtribe/learntrack/service/*.java \
com/airtribe/learntrack/exception/*.java \
com/airtribe/learntrack/utility/*.java \
com/airtribe/learntrack/ui/Main.java

Once compilation done, it will create .class file generated

-----

### How to run the project 

from terminal src folder run command - 

- java com.airtribe.learntrack.ui.Main
----

## The program will run with a menu options available. It is the Menu driven for the application. 


### UML Class Diagram

-----
Person <|-- Student

StudentService ------> Student

CourseService -------> Course

EnrollmentService ---> Enrollment

- Main -------------> StudentService
- Main -------------> CourseService
- Main -------------> EnrollmentService

- StudentService ------> EntityNotFoundException
- CourseService -------> EntityNotFoundException
- EnrollmentService ---> EntityNotFoundException

Main -------------> IdGenerator
