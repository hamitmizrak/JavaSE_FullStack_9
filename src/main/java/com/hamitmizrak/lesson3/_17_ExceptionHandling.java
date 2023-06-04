package com.hamitmizrak.lesson3;
import java.io.IOException;

public class _17_ExceptionHandling {
    public static void main(String[] args) throws IOException,ClassNotFoundException,NullPointerException,ArithmeticException {

        try {
            int result = 3 / 0;
            System.out.println(result);
        } catch (ArithmeticException ai) {
            //ai.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Db.close or port.close");
        }

        System.out.println("SON ADIM");

        //throw new RuntimeException("Çalışma zamanı hatası olduuuuuuuu");
        throw new _17_HamitMizrakException("istisna meydana geldi");
    }
}
