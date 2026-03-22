[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/NLDc-RAg)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23232077)

# Cereal Lab 1 - ArrayLists and File Reading

This project is designed for AP CS-A, focusing on reading in files and using ArrayLists. The lab is based on the Cereal Lab provided by College Board on AP Classroom.

## Lab Directions and Prompt

You have created a class from a given description or specification several times. This capability is an important skill, but equally important is the ability to determine which information is essential when creating a class. What is “essential” can vary based on perspective or can be determined by a question being asked or a problem that someone is attempting to solve. This activity will give you an opportunity to practice making this type of determination. Consider the following selection.

<img width="587" height="397" alt="image" src="https://github.com/user-attachments/assets/16400c15-c49c-4c95-84c5-bf8ec4b546de" />

[https://www.kaggle.com/crawford/80-cereals/version/2#cereal.csv]

This table of cereal data is publicly available on Kaggle.com. Each row in the table is a record representing a different breakfast cereal you would commonly find in the grocery store and contains data about that cereal, including name, type (hot or cold), calories, protein, fat, sodium, fiber, carbohydrates, sugar, potassium, vitamins, shelf, weight, cups, and rating. This table contains more information than we need to answer the questions posed in this activity.

You have been given a file called `cerealSubset.csv` that contains the data deemed “essential” for this lab. The file contains **the name, calories, fiber, carbohydrates**, and **cups** for 76 different cereals.  Write the `Cereal` class with appropriate instance variables, a constructor, accessor methods for each instance variable, and a toString() method to display all the data for a Cereal object.

Once you have designed and written the **`Cereal`** class to represent a Cereal object, you will want to write a program to process the data. Processing the data will include reading each data entry from a file. You will create another class, **`CerealRunner`**, to read in a data set of cereal information to analyze the nutrition facts of a group of cereals. The `CerealRunner` class should have a private instance variable to store an ArrayList of Cereal objects. You will use a Scanner object to read the data from `cerealSubset.csv` into a String for each line. You’ll then parse, or split, the data into an array of Strings using the split() method from the String class. You will then use the elements of that array to create Cereal objects and store them into your ArrayList. Recall that the array of Strings must be cast to the data types expected in the Cereal class. When `CerealRunner.java` is run, the output should print “76 records created.”.

## Project Structure

- **`cerealSubset.csv`**: A file that contains the name, calories, fiber, carbohydrates, and cups for 76 different cereals.  
- **`Cereal.java`**, **`CerealRunner.java`**: Contains class file stubs. Students are required to complete these classes and the appropriate methods.
- **`CerealTest.java`**, **`CerealRunnerTest.java`**: JUnit test cases for each method in `Cereal.java` and `CerealRunner.java`. These tests validate the correctness of the implemented methods.
- **`pom.xml`**: Maven configuration file that manages dependencies and plugins required to build and run the project.

## Workflow Instructions

### Accept the Project

Use link found in Canvas to accept in GitHub Classroom. You may have to check your GitHub account associated email or the GitHub inbox tray to have access to the assignment.

### Clone the Repository

Open the repository in GitHub Codespaces. (Or clone to your local machine and use your preferred IDE.)

### Write the Class Files

- Complete the `Cereal.java` class file.
- Complete the `CerealRunner.java` class file.

### Run Tests

Run the JUnit tests to verify your implementations

### Push Work to the Repository

When your code passes all tests, Commit and Sync to push your answers to the Repo for submission.

## Grading
Your grade will be based on the correctness of your implementations as verified by the unit tests. Make sure all methods are completed and that all tests pass.

## Honor Code
Remember to adhere to the GSSM Academic Integrity Policy. Do not copy code from others or AI, and ensure all work is your own.

## Contact
If you have any questions or need assistance, send me an email or come to office hours. 

## Prerequisites for Local Work

- Java 17 (or compatible version)
- Maven 3.x

You can also use Codespaces and the environment will load the required packages automatically upon prompt.

## Acknowledgements
This project has been adapted from the cereal lab available on AP Classroom by College Board.
