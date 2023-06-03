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

        // ÖDEV
        // Ödev: Kullanıcıdan aldığınız isim ve soyismin; (isimi: scanner ve soyismi: jOptionalPane)
        // bu kelimenin harf sayısı ? [ ipucu: length() ]
        // bu kelimenin bütün karakteri büyük yapalım ? [ ipucu: toUpperCase()]
        // bu kelimenin bütün karakteri küçük yapalım ? [ ipucu: toLowerCase()]
        // bu kelimenin başında ve sonunda boşlukları alalım ? [ ipucu: trim()]
        // bu kelimenin j ile başlıyoru mu ?   [ ipucu: startsWith("j")]
        // bu kelimenin a ile biter mi ?   [ ipucu:  endsWith("a")]
        // bu kelimenin ilk harfi ? [ ipucu: charAt(0)]
        // bu kelimenin içinde baştan Altan geçiyor mu ? [ ipucu: indexOf("java")]
        // bu kelimenin içinde sondan Berkan geçiyor mu ? [ ipucu: lastIndexOf("java")]
        // bu kelimenin 4.harften sonra gösterilsin ? [ ipucu: substring(4)]
        // bu kelimenin sonuna INC ekleyelim  ? [ ipucu: concat(".INC")]
        // bu kelimenin içerisinde java44 geçiyor mu ? [ ipucu: contains("java44")]
        // bu kelimenin "deneme" ile aynı mı ?  [ipucu: ipucu: equals("deneme");]
        // equals ile comparateTo arasındaki fark nedir ?

    }
}
