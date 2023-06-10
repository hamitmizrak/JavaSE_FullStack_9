package com.hamitmizrak.lesson5_oop_abstract;

public class MainOop {
    public static void main(String[] args) {
        Person person=new Student();  //polymorphism
        person.setId(1L);
        person.setName("person adı");
        person.setSurname("person soyadı");
        System.out.println(person);
        person.fullName();  //polymorphism
        System.out.println("*************************");

        Student student=new Student();
        student.setId(1L);
        student.setName("öğrenci adı");
        student.setSpecialStudent("Öğrenci özeli");
        student.setSurname("öğrenci soyadı");
        System.out.println(student);
        student.fullName();  //polymorphism
        student.govdesizMethod();  //polymorphism

        System.out.println("*************************");

        Teacher teacher=new Teacher();
        teacher.setId(1L);
        teacher.setName("teacher adı");
        teacher.setSurname("teacher soyadı");
        teacher.setSpecialTeacher("Teacher özeli");
        System.out.println(teacher);
        teacher.fullName(); // polymorphism
        teacher.govdesizMethod();  //polymorphism
    }
}
