package com.hamitmizrak.lesson4;

import java.util.Scanner;

enum EFactoriyel{
    ITERATIVEFACTORIYEL,RECURSIVEFACTORIYEL
}

public class _22_ExamplesRecursive {
    public static int scannerUserData() {
        // Faktöriyel hesaplama ayapan iterative algoritmasıyla yazınız ?
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen faktöriyel için sayı giriniz");
        int number = klavye.nextInt();
        if (number < 0) {
            System.out.println("Negatif sayı giremezsiniz");
            number = Math.abs(number);
        }
        return number;
    }

    public static void iterativeFactoriyel() {
        int number = scannerUserData();
        int fac = 1;
        for (int i = number; i >= 1; i--) {
            fac *= i;
        }
        System.out.println(number + " sayısının Faktöriyeli sonucu: " + fac+" \n");
    }

    public static void recursiveFactoriyel(){}

    public static void allMethod() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen Seçim yapınız.\n1-)" +
                EFactoriyel.ITERATIVEFACTORIYEL.toString()+
                "\n2-)"+
                EFactoriyel.RECURSIVEFACTORIYEL.toString()+
                "\n3)Çıkış");
        int chooise = klavye.nextInt();
        switch (chooise) {
            case 1:
                System.out.println("\n ### Iterative factoriye ###");
                iterativeFactoriyel();
                break;
            case 2:
                System.out.println("\n ### Recursive factoriye ###");
                recursiveFactoriyel();
                break;
            case 3:
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        while(true){
            allMethod();
        }
    } //end psvm
} //end class
