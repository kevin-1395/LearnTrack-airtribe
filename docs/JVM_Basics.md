What is JDK, JRE & JVM 

JDK - Java Development Kit. It consists of Java Runtime Environment and Java Virtual Machine 
When we download and install Java on our system, JDK will be installed and not JRE / JVM 


JRE - Java Runtime Environment 



JVM - Java Virtual Machine 

JVM consists of 3 phrase 

1. Class Loader
2. JVM Memory
3. Execution 

Class Loader: This is one of the first phrase of execution of the program. Bootstrap class loader will load all necessary classes. 
Extension class loader in the second will load all the external classes which is required by the code. 

Linking phrase: This is where the code will be verified and check for formatting and illegal operation and Bytecode verifier
Preparation steps is where the allocation of memory for static variable and static block of code

Intialization phrase: Static variable and static block of code will  be executed. Ex. database config.

Runtime Access Area: We have method name, Head Area and Stack memory. 

Class will go into method name, 
Objects in heap area 
Multiple threads in the stack memory. 