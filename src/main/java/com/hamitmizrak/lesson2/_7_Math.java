package com.hamitmizrak.lesson2;

import java.util.Random;

public class _7_Math {

    public static void main(String[] args) {

        // static : Math
        System.out.println(Math.min(-100, 66));
        System.out.println(Math.max(-100, 66));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.round(6.4));
        System.out.println(Math.round(6.5));

        // Math Random
        double random1 = Math.floor(Math.random() * 9 + 1);
        System.out.println(random1);

        // Random
        Random random2 = new Random();
        int number = random2.nextInt(9) + 1;
        System.out.println(number);

        // ÖDEV
        // hipotenüs
        // Kullanıcıdan alınan 2 sayı üçgenin dik kenarlarıdır hipotenüs uzunluğunu
        // bulalım
        // 1.dikkenar:3
        // 2.dikkenar:4
        // hipotenüs: 3*3+4*4 => karekökü
        // Formül x=Karekök(x1^2+x2^2)

    }
}
