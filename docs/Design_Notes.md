Why ArrayList instead of Array? 

=> Array's have only dedicated/limited space allocation with a fixed size. 

Example, String[] array = new int[100];

We are using ArrayList because it's more flexible when store and deletion of data. 
ArrayList do not have fixed size. More flexible with functions and more readable.
-------
Where were static members used and why? 

=> Static members and variable are used in Id-generator in utility

static studentCounterId = 1
static courseCounterId = 1
static enrollmentCounterId = 1

static getNextStudentId()
static getNextCourseId()
static getNextEnrollmentId()

Because objects created will not have a specific id created. Which could create duplication. 
These IDs will be used across this application. 
---

Where was Inheritance used and What are gained from it? 

=> Yes it implements with using Person and Student classes

We have a Person class which has few common properties. 

id, firstname, lastname, email

Student extends Person class 
batch,active

Inheritance allows method overriding and runtime polymorphism. 
Here few methods of Person can be inherited by Student class.
----
