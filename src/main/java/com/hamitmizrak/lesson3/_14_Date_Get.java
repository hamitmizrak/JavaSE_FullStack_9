package com.hamitmizrak.lesson3;

import java.util.Date;

public class _14_Date_Get {
    public static void main(String[] args) {
        java.util.Date date=new Date();
        System.out.println(date);

        // Pazar:0 Pazartesi:1 ....
        System.out.println("Gün: "+date.getDay());

        // Aylar Saymaya sıfırdan(0) başlar
        // Ocak:0 şubat:1 Mart:2 Nisan:3 Mayıs:4 Haziran:5
        System.out.println("Ay: "+date.getMonth());

        // Yıl: 1900 ekle veya çıkar
        System.out.println("Yıl: "+(date.getYear()+1900) );

        // saat
        System.out.println("Saat: "+(date.getHours()) );
        System.out.println("Dakika: "+(date.getMinutes()) );
        System.out.println("Saniye: "+(date.getSeconds()) );

        // String Concat
        String fullTime=date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        System.out.println(fullTime);
    }
}
