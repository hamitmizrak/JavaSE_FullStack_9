package com.hamitmizrak.lesson6_oop_abstract;

import lombok.Data;

import java.util.Date;

// LOMBOK
@Data

public class Student extends  Person{
    private String specialStudent;

    public Student() {
    }
    public Student(Long id, String name, String surname, Date createdDate) {
        super(id, name, surname, createdDate);
    }

    public Student(Long id, String name, String surname, Date createdDate, String specialStudent) {
        super(id, name, surname, createdDate);
        this.specialStudent = specialStudent;
    }

    // METHOD
    @Override
    public void fullName() {
        System.out.println(" Student Full Name: "+ this.getName()+this.getName());
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Student Gövdesiz Method");
    }

    @Override
    public String toString() {
        return "Student{" +
                "specialStudent='" + specialStudent + '\'' +
                "} " + super.toString();
    }
    // super.id   super.toString()  super();
}
