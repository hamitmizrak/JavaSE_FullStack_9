package com.hamitmizrak.lesson4;

public enum _21_Enum {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}


class EnumMain{
    public static void main(String[] args) {
        System.out.println(_21_Enum.PAZARTESI);
        String str=_21_Enum.PAZARTESI.toString();
        System.out.println(str);

        System.out.println("*******************");
        System.out.println(_21_Enum.PAZARTESI.ordinal());
        System.out.println(_21_Enum.PAZARTESI.values()[1]);
    }
}
