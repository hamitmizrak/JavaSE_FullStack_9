package com.hamitmizrak.lesson2_String_Math_Loop_Conditional;

import java.util.Scanner;

public class _11_Examples2_Conditional {

    public static void main(String[] args) {

        // ÖDEV-1 (Password Repassword)
        // kullanıcıdan alınan iki değeri karşılaştırma (equals)
        // kullanıcıdan alınan iki değeri karşılaştırma (equalsIgnoreCase)
        // password - repassword

        // ÖDEV-2 (Radar)
        // Kullanıcı tarafından alınan bir sayıya göre ceza kesilecektir.
        // Hızı:79 kadar ise para cezası  : 0 TL      ==>  1<=speed<=79
        // Hızı:80 ise para cezası : 800 TL hızlısınız   ==>  80<=speed<=94
        // Hızı:95 ise para cezası : 1200 TL çok hızlısınız   ==>  95<=speed<=119
        // Hızı:120 ise para cezası: 2000 TL  tehlikeli hızlısınız ==>  speed>=120
        // Soför kaç kere trafik cezası yediğini ve toplam para cezasını
        // ve eğer toplam ceza sayısı 5 ve üstüne ise ehliyetine el konulsun  hesaplayan algoritma yazalım ?

        // ÖDEV-3
        // Klavyeden girilen karakter harf mi , sayı mı , özel simge mi ?
        while(true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\nLütfen bir karakter giriniz");
            char data=klavye.nextLine().charAt(0);
            if(Character.isLetter(data))
                System.out.println(data+ " Bu harftir");
            else if(Character.isDigit(data))
                System.out.println(data+ " Bu sayıdır");
            else
                System.out.println(data+ " Bu özel simgedir");
        }


    }
}
