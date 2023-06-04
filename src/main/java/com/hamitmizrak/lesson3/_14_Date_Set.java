package com.hamitmizrak.lesson3;

import java.util.Date;

public class _14_Date_Set {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        // AY:
        date.setMonth(0);
        System.out.println("Ay: "+(date.getMonth()));

        // YIL
        date.setYear(2021);
        System.out.println("Yıl: "+(date.getYear()));

        // SAAT 0<=X<=23
        date.setHours(23);
        System.out.println("Saat: "+(date.getHours()) );

        // DAKIKA 0<=X<=59
        date.setMinutes(59);
        System.out.println("Dakika: "+(date.getMinutes()) );

        // SANIYE 0<=X<=59
        date.setSeconds(59);
        System.out.println("Saniye: "+(date.getSeconds()) );

        // String Concat
        String fullTime=date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        System.out.println("TAM "+fullTime);

    }
}
