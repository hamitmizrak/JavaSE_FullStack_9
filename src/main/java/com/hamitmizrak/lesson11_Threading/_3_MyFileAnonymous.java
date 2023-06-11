package com.hamitmizrak.lesson11_Threading;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class _3_MyFileAnonymous {

    private Long threadId;
    private String threadData;

    // Parametresiz Constructor
    public _3_MyFileAnonymous() {
    }

    // Parametreli Constructor
    public _3_MyFileAnonymous(Long threadId, String threadData) {
        this.threadId = threadId;
        this.threadData = threadData;
    }

    // PSVM
    public static void main(String[] args) {
        _3_MyFileAnonymous myFileAnonymous = new _3_MyFileAnonymous();

        Thread anonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                    try {
                        Thread.sleep(1000);
                        if (i == 1) {
                            System.out.println("\n### Thread Başladı###");
                            System.out.println(i + ". => ID: "+myFileAnonymous.threadId +" Thread Name=>" + myFileAnonymous.threadData);
                        } else if (i == 10) {
                            System.out.println("\n### Thread Bitti###");
                            System.out.println(i + ". => ID: " + myFileAnonymous.threadId + " Thread Name=>" + myFileAnonymous.threadData);
                        } else {
                            System.out.println(i + ". => ID: " + myFileAnonymous.threadId + " Thread Name=>" + myFileAnonymous.threadData);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } //end for
            } // end run
        }); // end anonymous


        _1_MyFileExtends mysql=new _1_MyFileExtends(1L, "Threading-1");
        _1_MyFileExtends mssql=new _1_MyFileExtends(2L, "Threading-2");
        _1_MyFileExtends oracle=new _1_MyFileExtends(3L, "Threading-3");

        // Threading
        System.out.println("mysql ID: "+mysql.getId());
        System.out.println("mysql hashCode: "+mysql.hashCode());
        System.out.println("mysql isAlive: "+mysql.isAlive());
        System.out.println("mysql getName: "+mysql.getName());
        mysql.setName("Process Thread");
        System.out.println("mysql getName: "+mysql.getName());

        System.out.println("mysql instance ID: "+mysql.getThreadId());
        System.out.println("mysql instance DATA: "+mysql.getThreadData());

        mysql.start();
        System.out.println("mysql isAlive: "+mysql.isAlive());

    } //end PSVM
}//end Class
