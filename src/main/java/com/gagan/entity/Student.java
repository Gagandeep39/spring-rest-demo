package com.gagan.entity;

public class Student {

    private String firstName;
    private String lastName;

    Student(){}

    public Student(String firstName, String lasString) {
        this.firstName = firstName;
        this.lastName = lasString;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
