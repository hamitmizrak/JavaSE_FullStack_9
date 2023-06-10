package com.hamitmizrak.lesson6_oop_abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Person {
    private Long id;
    private String name;
    private String surname;
    private Date createdDate = new Date(System.currentTimeMillis());

    // Method
    public void fullName() {
        System.out.println(this.name.concat(" ").concat(this.surname));
    }

    abstract public void govdesizMethod();
}
