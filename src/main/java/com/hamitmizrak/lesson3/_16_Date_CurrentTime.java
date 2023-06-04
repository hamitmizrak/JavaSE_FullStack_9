package com.hamitmizrak.lesson3;

import java.util.Date;

public class _16_Date_CurrentTime {
    public static void main(String[] args) {
        // şimdiki zaman - 1 ocak 1900  -> = milisaniye (1000)
        long current = System.currentTimeMillis();
        System.out.println("Current: "+current);

        // Date: şimdiki zamanı veriyor
        Date date= new Date(System.currentTimeMillis());
        System.out.println("Date: "+date);

        // toString
        String dateTo=new Date(System.currentTimeMillis()).toString();
        System.out.println("toString: "+dateTo.substring(0,3));
    }
}
