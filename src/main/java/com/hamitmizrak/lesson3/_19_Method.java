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
}
