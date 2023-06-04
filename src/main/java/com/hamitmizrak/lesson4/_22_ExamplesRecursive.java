package com.hamitmizrak.lesson4;

import java.util.Scanner;

// ENUM
enum EFactoriyel {
    ITERATIVEFACTORIYEL, RECURSIVEFACTORIYEL
}

// STATIC
class staticData {
    //const
    public static final String LOGOUT = "Çıkış";
}

public class _22_ExamplesRecursive {
    // User Scanner
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

    // Iterative Method
    public static void iterativeFactoriyel() {
        int number = scannerUserData();
        int fac = 1;
        for (int i = number; i >= 1; i--) {
            fac *= i;
        }
        System.out.println(number + " sayısının Faktöriyeli sonucu: " + fac + " \n");
    }

    // Recursive Method
    public static int recursiveFactoriyel(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * recursiveFactoriyel(number - 1);
    }

    // Bütün Metot
    public static void allMethod() {
        while (true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Lütfen Seçim yapınız.\n1-)" +
                    EFactoriyel.ITERATIVEFACTORIYEL.toString() +
                    "\n2-)" +
                    EFactoriyel.RECURSIVEFACTORIYEL.toString() +
                    "\n3)" + staticData.LOGOUT);
            int chooise = klavye.nextInt();
            switch (chooise) {
                case 1:
                    System.out.println("\n ### Iterative factoriye ###");
                    iterativeFactoriyel();
                    break;
                case 2:
                    System.out.println("\n ### Recursive factoriye ###");
                    int number = scannerUserData();
                    int result = recursiveFactoriyel(number);
                    System.out.println(number + " sayısının Faktoriyel sonucu: " + result);
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sadece belirtilen sayıyı giriniz\n");
                    break;
            } //end switch case
        } // end while loop
    }// end method

    // PSVM
    public static void main(String[] args) {
            allMethod();
    } //end psvm
} //end class
