package com.hamitmizrak.lesson2;

public class _8_String {

    public static void main(String[] args) {
        String str1 = "java merhaba java ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        str1 = str1.trim();
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.replace(str1, "Yeni"));
        System.out.println(str1.concat(".INC"));

        System.out.println(str1.indexOf("java"));
        System.out.println(str1.lastIndexOf("java"));

        System.out.println(str1.charAt(0));

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(0, 3)); //0<=X<=3-1

        System.out.println(str1.startsWith("java"));
        System.out.println(str1.endsWith("malatya"));

        System.out.println(str1.isEmpty());
        System.out.println("\n*****************\n");

        // Regex eğer birşey yazmazsak bize karakter dizisi verir.
        // String[] temp = str1.split(" ");
        // Regex eğer birşey yazmazsak bize karakter dizisi verir.
        String[] temp = str1.split("");
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);

    }
}
