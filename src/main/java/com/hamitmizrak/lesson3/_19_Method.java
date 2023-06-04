package com.hamitmizrak.lesson3;

public class _19_Method {


    // parametresiz returnsuz
    public static void parametresizReturnsuz() {
        System.out.println("parametresiz Returnsuz");
    }

    // Overloading
    // parametresiz returnsuz
    public static void parametresizReturnsuz(int x) {
        System.out.println("parametresiz Returnsuz");
    }

    ////////////////////////////////////////////////////

    // parametreli returnsuz
    public static void parametreliReturnsuz(String str) {
        System.out.println("parametreli Returnsuz: " + str);
    }


    ////////////////////////////////////////////////////
    // parametresiz returnlu
    public static String parametresizReturnlu() {
        return "parametresiz Returnlu";
    }

    ////////////////////////////////////////////////////
    // parametreli returnlu
    public String parametreliReturnlu(String str2) {
        return "parametreli Returnlu " + str2;
    }

    // Java By pass value ?

    public static void main(String[] args) {
        parametresizReturnsuz();
        parametreliReturnsuz("Malatya");

        String str1 = parametresizReturnlu();
        System.out.println(str1);

        _19_Method method=new _19_Method();
        String str2 = method.parametreliReturnlu("Ankara");
        System.out.println(str2);
    }

    // ÖDEVLER
    // Palindrom (Metotla yapıyoruz)
    // Girilen bir kelimenin tersten okunuşu ve düzden okunuşu aynı ise palindrom denir
    // Örneğin: ama kelime düzden ve tersten aynı okunuyor.

    // ÖDEV
    // Asal sayı: eğer bir sayı kendisine ve 1 sayısına bölünüyorsa asal sayıdır
    // En küçük asal sayı 2 ve aynı zaman sadece 1 tane çift asal sayın vardır.
    // 2,3,5,7,11 Asal sayıdır. Çünkü sadece 1 ve kendisine bölünür
    // 4,6,8,9 Asal değilidir.
    // Örneğin: 9  sayısı ==> 1 ve kendisine (9) bölünür ve 3 sayısınada bölünüyor
    // asal sayi asal degildir ==> 6/6 6/1 6/2 6/3
}
