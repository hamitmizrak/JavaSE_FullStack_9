package com.hamitmizrak.lesson3;

import java.util.Arrays;

public class _24_Array {

    public void deneme1(int[] dizi){}
    public void deneme2(int... dizi){}

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        for (int i = 0; i <matrix.length ; i++) { //row
            for (int j = 0; j <matrix[i].length ; j++) { //cols
                //System.out.print(matrix[i][j]+" ");
                if(i>j){
                    System.out.print("*");
                }else if(i<j){
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        // ÖDEV Diaganol Matrix

        // ÖDEV
        // Kullanıcıdan alınan bilgilere göre doğru kullanıcı adı ve şifre girerse
        // sisteme giriş sağlanacak
        // yoksa deneme hakkı 4"ten başlayarak aşağıya doğru azalacak
        // deneme hakkı eğer 0 olursa sistemden atacak ve hesabını bloke konulacak. Bu
        // adı ve şifreyi tek boyutlu dizide tutacaksınız
        // algoritmayı dizi ile yapalım
        // NOT: kullanıcıdan alınan username ve password String[] dizi metodu olacaktır.
        // default kullanıcı ad: admin
        // default şifre:root

        //ÖDEV
        // konsoldan kaç elemanlı elemanlı bir dizi olacak bu elemanlara rastgele sayılar girilecek
        // -a) başlangıç ve bitişi consolden kullanıcı yazacak
        // -b) ilk sayı ile son sayının toplamını alalım.
        // -c) bütün sayılar toplamı
        // -d) metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.

        // ÖDEV TC kimlik algoritması ?
        // STEP-1
        // 11 haneden oluşan numaraların iki bölümü bulunuyor.
        // aslında kimlik numarası ilk 9 hane. numaranın son iki hanesi ise, ilk dokuz hanenin “sağlamasını” yapıyor.

        // STEP-2
        // kimlik numaralarının son 2 harfi, sadece ilk 9 rakamının doğrulayıcısı konumundadır. yani asıl numaramız ilk 9 rakamdadır.
        // t.c. kimlik numaraları 11 basamaktan oluşmaktadır. ilk 9 basamak arasında kurulan bir algoritma bize 10. basamağı, ilk 10 basamak arasında kurulan algoritma ise bize 11. basamağı verir.

        // STEP-3
        //+ ilk hane 0 olamaz.
        //* t.c. kimlik numaralarımızın 1. 3. 5. 7. ve 9. hanelerinin toplamının 7 katından, 2. 4. 6. ve 8. hanelerinin toplamı çıkartıldığında, elde edilen sonucun 10'a bölümünden kalan, yani mod10'u bize 10. haneyi verir.
        //* 1. 2. 3. 4. 5. 6. 7. 8. 9. ve 10. hanelerin toplamından elde edilen sonucun 10'a bölümünden kalan, yani mod10'u bize 11. haneyi verir.

    }
}
