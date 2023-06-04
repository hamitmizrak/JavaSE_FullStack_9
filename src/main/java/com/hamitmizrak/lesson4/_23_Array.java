package com.hamitmizrak.lesson4;

import java.util.Arrays;

public class _23_Array {

    public static void main(String[] args) {
        int[] dizi = new int[10];
        dizi[0] = 1;
        dizi[1] = 8;
        dizi[3] = 4;
        dizi[2] = 7;
        dizi[4] = 5;
        dizi[9] = 10;

        // ITERATIVE FOR
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        // FOR EACH
        System.out.println("##########");


        int[] dizi2 = {5, 8, 9, 1, 2, 6, 4};
        Arrays.sort(dizi2);
        for (int temp : dizi2) {
            System.out.print(temp + " ");
        }
        System.out.println("\n##########");
        String arrayToString = dizi2.toString();
        System.out.println(arrayToString);

        int [] clone1=dizi2.clone();
    }
}
