package com.hamitmizrak.lesson2_String_Math_Loop_Conditional;

import java.util.Scanner;

public class _10_Conditional2 {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen hafta içi gün sayısını giriniz");
        int number = klavye.nextInt();

        // if else if
        if (number == 1) {
            System.out.println("pazartesi");
        } else if (number == 2) {
            System.out.println("salı");
        } else if (number == 3)
            System.out.println("çarşamba");
        else if (number == 4)
            System.out.println("perşembe");
        else if (number == 5)
            System.out.println("cuma");
        else
            System.out.println("farklı gün");

        //switch
        switch (number) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            default:
                System.out.println("farklı gün");
                break;
        }
    }
}
