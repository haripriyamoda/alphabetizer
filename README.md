# Alphabetizer application
A Java command line application that can read a series of strings and sorts the characters alphabetically.

The source is laid out as follows:

        ├── pom.xml - Maven build descriptor
        └── src
            ├── main 
            │   ├── java - Java application source code
            │   ├── resources - Empty
            │      
            └── test
            │   ├── java - Java test source
            │   └── resources - Test resources
            

## Building
The project produces a jar artifact via a Maven build system:

1. Java JAR artifact containing java application source

    mvn clean package
    
    Which also runs included test cases for alternate solutions provided.
    
    

## Running
The software can be run on a developer workstation using the following command:

java -jar target/alphabetizer-1.0.jar
