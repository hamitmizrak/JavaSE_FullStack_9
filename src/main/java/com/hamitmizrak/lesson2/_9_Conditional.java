package com.hamitmizrak.lesson2;

import java.util.Scanner;

public class _9_Conditional {

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int number=klavye.nextInt();
        if(number>0){
            System.out.println("Pozitif");
        }else
            System.out.println("negatif");

        String ternary=(number>0) ? "Pozitif":"negatif";
        System.out.println(ternary);

    }
}
