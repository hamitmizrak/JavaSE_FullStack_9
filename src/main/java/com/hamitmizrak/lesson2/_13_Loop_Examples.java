package com.hamitmizrak.lesson2;

import java.util.Random;
import java.util.Scanner;

public class _13_Loop_Examples {

    public static void main(String[] args) {

        // Örnek:RASTGELE
        // 1-9 arasında 5 tane random sayı üretelim ?
        // Bu sayılar nelerdir? (String.concat)
        // Bu sayıları toplayalım
        // Bu sayılar içinde tek sayı toplamı
        // Bu sayılar içinde tek sayı adeti
        /*int oddCounter=0,oddSum=0;
        String oddPiece="";
        int sum=0;
        for (int i = 0; i <=4 ; i++) {
            Random random=new Random();
            int temp= random.nextInt(9)+1;
            if(temp%2==1){
                oddCounter++;
                oddSum+=temp;
                //oddPiece=oddPiece.concat(String.valueOf(temp)+" ");
                //oddPiece=oddPiece.concat(Integer.toString(temp)+" ");
                oddPiece=oddPiece.concat(temp+" ");
            }else{}
            sum+=temp;
        } //end for
        System.out.println("Tek sayı elemanları: "+oddPiece);
        System.out.println("Genel Toplamları: "+sum);
        System.out.println("Tek sayılar adedi: "+oddCounter);
        System.out.println("Tek sayılar toplamı: "+oddSum);*/

        // Örnek: AKLINDA BİR SAYI TUT
        // Bir sayi söylüyoruz ve çıkan sonucu tahmin ediyoruz.
        // ipucu: sonuc her zaman 11 cıkıyor.
        // kullanıcıdan alınan sayının sonucu tahmin etmek
        // adım1: 1-100 arasında bir sayı olsun
        // adım1: Bu sayiyi 2 ile çarpın
        // adım2: sonuca 22 ekleyin
        // adım3: cikan sonucu 2 ile bolelim
        // adım4: bu sayiyi ilk sayidan çıkarın
        // Formulu: int sonuc = (((sayi * 2) + 22) / 2) - sayi;

        // Örnek : KLASIK VIZE/FINAL ÖRNEGİ
        // Vize Final Ödevi
        // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
        // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
        // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
        // bunun haricinde sürekli vize final sorsun
        // Not Harfleri ==> AA BA BB FF
        // not ortalaması: ortalama<50 altında ise kaldı FF
        // not ortalaması: ortalama==50 Geçti
        // not ortalaması: 55<=x<=69 BB
        // not ortalaması: 70<=x<=84 BA
        // not ortalaması: 85<=x<=100 AA
        // Vize:40% Final:60%
        // Dikkat: Consolda virgül kullanmalısın.
        // while sonsuz döngü   ==> while(true) {}
        // for sonsuz döngü     ==> for(;;) {}

        // Örnek: String ters çeviren algoritma
        // kullanıcı tarafından girilen bir kelimeyi tersten yazdıran Algoritma ?
        // yazdığınız kelime kaç harfli ?
        // Hamit ==> timaH

        String fullName="", reverseFullName="";
        Scanner klavye=new Scanner(System.in);
        System.out.println("\nLütfen adınızı giriniz");
        fullName=klavye.nextLine();
        for (int i = fullName.length()-1; i >=0 ; i--) {
            //reverseFullName= reverseFullName+ fullName.charAt(i);
            reverseFullName+= fullName.charAt(i);
        }
        System.out.println(fullName);
        System.out.println(reverseFullName);

        // Örnek : Password Masking
        // kullanıcı tarafından girilen bir parola için ilk ve son harfi haricinde *
        // eklensin ?
        // Hamit ==> H****t

    }
}
