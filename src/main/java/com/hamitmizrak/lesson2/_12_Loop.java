package com.hamitmizrak.lesson2;

public class _12_Loop {

    public static void main(String[] args) {

        //i++
        //i+=1
        //i=i+1
        //for(;;){}
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) { //
            sum1 = sum1 + i;
        }
        System.out.println("For: " + sum1);
        System.out.println("\n***************");
        //while(true){}
        int sum2 = 0;
        int k = 1;
        while(k <= 10){
            sum2 += k;
            k=k+1;
        }
        System.out.println("While: " + sum2);
        System.out.println("\n***************");
        int sum3 = 0;
        int x = 1;
        do{
            sum3 += x;
            x++;
        }while(x <= 10);
        System.out.println("Do-While: " + sum3);
    }
}
