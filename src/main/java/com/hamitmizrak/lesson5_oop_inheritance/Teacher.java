package com.hamitmizrak.lesson5_oop_inheritance;

import lombok.Data;

import java.util.Date;

// LOMBOK
@Data
public class Teacher extends Person{

    private String specialTeacher;

    public Teacher() {
    }

    public Teacher(Long id, String name, String surname, Date createdDate) {
        super(id, name, surname, createdDate);
    }

    public Teacher(Long id, String name, String surname, Date createdDate, String specialTeacher) {
        super(id, name, surname, createdDate);
        this.specialTeacher = specialTeacher;
    }

    // METHOD
    @Override
    public void fullName() {
        System.out.println(" Teacher Full Name: "+ this.getName()+this.getName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialTeacher='" + specialTeacher + '\'' +
                "} " + super.toString();
    }
}
