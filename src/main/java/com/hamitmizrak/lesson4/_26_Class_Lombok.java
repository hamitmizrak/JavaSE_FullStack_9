package com.hamitmizrak.lesson4;

// Class: Bir nesnesin özelliklerini tuttuğumuz yerdir.
// POJO:  field + Getter/Setter
// BEAN: field+constructor+ Getter/Setter, toString,EqualsHashCode

import lombok.Getter;
import lombok.Setter;

/*@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder*/
@Getter
@Setter
public class _26_Class_Lombok {
    private String username;
    private String surname;

    public static void main(String[] args) {
        _26_Class_Lombok instance= new _26_Class_Lombok();
        instance.setUsername("Hamit");
        System.out.println(instance.getUsername());
    }
}
