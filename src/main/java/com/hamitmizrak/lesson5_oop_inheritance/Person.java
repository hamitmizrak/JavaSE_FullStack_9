package com.hamitmizrak.lesson5_oop_inheritance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String surname;
    private Date createdDate=new Date(System.currentTimeMillis());

    // Method
    public void fullName(){
        System.out.println(this.name.concat(" ").concat(this.surname));
    }
}
