package com.hamitmizrak.lesson11_Threading;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class _1_MyFileExtends extends Thread {

    private Long threadId;
    private String threadData;

    // Parametresiz Constructor
    public _1_MyFileExtends() {
    }

    // Parametreli Constructor
    public _1_MyFileExtends(Long threadId, String threadData) {
        this.threadId = threadId;
        this.threadData = threadData;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
                if (i == 1) {
                    System.out.println("\n### Thread Başladı###");
                    System.out.println(i + ". => ID: " + threadId + " Thread Name=>" + threadData);
                } else if (i == 10) {
                    System.out.println("\n### Thread Bitti###");
                    System.out.println(i + ". => ID: " + threadId + " Thread Name=>" + threadData);
                } else {
                    System.out.println(i + ". => ID: " + threadId + " Thread Name=>" + threadData);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } //end for
    } // end run

    // PSVM
    public static void main(String[] args) throws InterruptedException {
        _1_MyFileExtends mysql = new _1_MyFileExtends(1L, "MYSQL");
        _1_MyFileExtends postgresql = new _1_MyFileExtends(2L, "POSTGRESQL");
        _1_MyFileExtends oracle = new _1_MyFileExtends(3L, "ORACLE");

        // Threading
        System.out.println("mysql ID: " + mysql.getId());
        System.out.println("mysql hashCode: " + mysql.hashCode());
        System.out.println("mysql isAlive: " + mysql.isAlive());
        System.out.println("mysql getName: " + mysql.getName());
        mysql.setName("Process Thread");
        System.out.println("mysql getName: " + mysql.getName());
        System.out.println("mysql instance ID: " + mysql.getThreadId());
        System.out.println("mysql instance DATA: " + mysql.getThreadData());

        // 1
        // Hepsi Aynı anda başlasın
        // ASENKRON
       /*
       mysql.start();
        System.out.println("mysql isAlive: "+mysql.isAlive());
        postgresql.start();
        oracle.start();
        */

        // 2
        // Sadece MYSQL başlasın bitsin sonra devam etsin
        // ÖNCELİK SIRALI SENKRON-ASENKRON
        /*
        mysql.start();
        mysql.join();
        postgresql.start();
        oracle.start();
        */

        // 3
        // SENKRON
        // Sadece MYSQL başlasın bitsin sonra devam etsin
        /*
        mysql.start();
        mysql.join();
        postgresql.start();
        postgresql.join();
        oracle.start();
        */

        // 4
        mysql.start();
        postgresql.start();
        mysql.join();
        postgresql.join();

        for (int i = 1; i <=5; i++) {
            if(i%2==0)
                oracle.wait(); // UYU
            else
                oracle.notify(); //KALK
        }
        oracle.start();
    }
}
