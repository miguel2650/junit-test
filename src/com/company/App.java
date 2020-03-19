package com.company;

import java.util.Scanner;

public class App {

    public void runApp() {
    // Taking user input from console
    Scanner scanner = new Scanner(System.in);

    // Scanner takes the next int.
        System.out.println("Welcome. Choose an option from the menu");
        System.out.println("1: Math additions");
        System.out.println("2: Math subtractions");
        System.out.println("3: Math multiplications");
        System.out.println("4: Create a student object");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You are about to add 2 numbers together.");
                System.out.println("Insert the first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Now insert the second number");
                int secondNumber = scanner.nextInt();
                System.out.println("The result is: " + firstNumber+ " + "+ secondNumber+ " = "+ addition(firstNumber,secondNumber));
                break;
            case 2:
                System.out.println("You are about to subtract 2 numbers from each other");
                System.out.println("Insert the first number");
                firstNumber = scanner.nextInt();
                System.out.println("Now insert the second number");
                secondNumber = scanner.nextInt();
                System.out.println("The result is: " + firstNumber+ " + "+ secondNumber+ " = "+ subtraction(firstNumber,secondNumber));
                break;
            case 3:
                System.out.println("You are about to multiply two numbers");
                System.out.println("Insert the first number");
                firstNumber = scanner.nextInt();
                System.out.println("Now insert the second number");
                secondNumber = scanner.nextInt();
                System.out.println("The result is: " + firstNumber+ " + "+ secondNumber+ " = "+ multiplication(firstNumber,secondNumber));
                break;
            case 4:
                System.out.println("You are about to create a new student");
                System.out.println("Type the students first name");
                String firstName = scanner.next();
                System.out.println("Type the students age");
                int age = scanner.nextInt();
                System.out.println("Type the students haircolor");
                String hairColor = scanner.next();
                Student newStudent = new Student(firstName,age,hairColor);
                System.out.println("You have created a new student, say hi "+firstName+"!");
                newStudent.sayHi();

        }
    }
    // Function for addition.
    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Function for subtration
    public int subtraction(int firstNumber, int secondNumber) {
        // The largest number must be first in order to get a positive result
        if(firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }
    }

    //Function for multiplication
    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}


