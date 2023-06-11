package com.hamitmizrak.lesson2_String_Math_Loop_Conditional;

public class _3_Primitive_Wrapper {

    public static void main(String[] args) {
        // Primitive Type (ilkel Tipler)
        // stack hafızayı kullanır.
        // null alamaz

        // tam sayı
        byte b1 = 127;
        short s1 = 130;
        int i1 = 4151515;
        long l1 = 4554454512L;

        // virgüllü sayı
        float f2 = 14.53F;
        double d2 = 151515511515.51511515;

        // boolean
        boolean b3 = 3 > 1;

        // karakter
        char c4 = '\u4125';
        System.out.println(c4);

        ////////////////////////////////////
        // Wrapper Type (Gelişmiş Tipler)
        // heap hafızayı kullanır.
        // null alabilir.

        // tam sayı
        Byte w_b1 = 127;
        Short w_s1 = 130;
        Integer w_i1 = 4151515;
        Long w_l1 = 4554454512L;

        // virgüllü sayı
        Float w_f2 = 14.53F;
        Double w_d2 = 151515511515.51511515;

        // boolean
        Boolean w_b3 = 3 > 1;

        // karakter
        Character w_c4 = '\u4125';
        System.out.println(c4);

        //////////////////////////////////
        //int sayi1=null;
        //Integer sayi2=null;

        int sayi2=14;
        Integer sayi3=sayi2; //boxing
        sayi3=null;

    }
}
