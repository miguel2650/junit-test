package com.company;

public class Student {
    String firstName;
    int age;
    String hairColor;

    public Student(String firstName, int age, String hairColor) {
        this.firstName = firstName;
        this.age = age;
        this.hairColor = hairColor;
    }

    public void sayHi() {
        System.out.println("Hello everyone!");
        System.out.println("My name is "+firstName);
        System.out.println("I am "+age+" years old");
        System.out.println("My haircolor is "+hairColor);
    }
}
