package com.hamitmizrak.lesson2_String_Math_Loop_Conditional;

import javax.swing.*;

public class _6_Scanner_JOptionalPane {

    public static void main(String[] args) {

        // SCANNER
        /*int number1=0,number2=0,result1=0;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz");
        number1=klavye.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz");
        number2=klavye.nextInt();
        result1=3*number1+4*number2;
        System.out.println(result1);*/

        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        // y =?  (Cevap :27)

        int clientData1= Integer.parseInt(JOptionPane.showInputDialog("Lütfen 1.sayıyı giriniz"));
        int clientData2= Integer.parseInt(JOptionPane.showInputDialog("Lütfen 2.sayıyı giriniz"));
        System.out.println(clientData1+clientData2);

        // 3.soru iki sayıda dört işlem
        // x1=4, x2=2;
        // Toplama =?
        // Çıkarma =?
        // Çarpması ?
        // Bölüm = ?
        // Bölümünde kalan ?

        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece kaç fahranhayttır? (Cevap: 32 fahrenhayttır)


        // 4.soru VKI
        // VKI: Vücut Kitle Indeki hesaplayana algoritma yazınız ?
        // boy=181 CM
        // kilo: 92 KG
        // Erkek/ Bayan için Formül: VKI=kilo/boy*boy
    }
}
