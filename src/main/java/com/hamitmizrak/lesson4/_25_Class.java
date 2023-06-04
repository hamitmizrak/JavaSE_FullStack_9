package com.hamitmizrak.lesson4;

// Class: Bir nesnesin özelliklerini tuttuğumuz yerdir.
// POJO:  field + Getter/Setter
// BEAN: field+constructor+ Getter/Setter, toString,EqualsHashCode
public class _25_Class {

    // field
    private String username;
    private String surname;

    //ToString
    @Override
    public String toString() {
        return "_25_Class{" +
                "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    //GETTER/SETTER
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        _25_Class aClass=new _25_Class();
        aClass.setUsername("Hamit");
        aClass.setSurname("Mızrak");
        System.out.println(aClass);
    }
}
