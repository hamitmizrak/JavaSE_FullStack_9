package com.hamitmizrak.lesson11_Threading;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class _4_MyFileAnonymous_LambdaExpression {

    private Long id;
    private String threadName;

    // Parametresiz Constructor
    public _4_MyFileAnonymous_LambdaExpression() {
    }

    // Parametreli Constructor
    public _4_MyFileAnonymous_LambdaExpression(Long id, String threadName) {
        this.id = id;
        this.threadName = threadName;
    }

    // PSVM
    public static void main(String[] args) {
        _4_MyFileAnonymous_LambdaExpression myFileAnonymous = new _4_MyFileAnonymous_LambdaExpression();

        Thread anonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                    try {
                        Thread.sleep(1000);
                        if (i == 1) {
                            System.out.println("\n### Thread Başladı###");
                            System.out.println(i + ". => ID: "+myFileAnonymous.id +" Thread Name=>" + myFileAnonymous.threadName);
                        } else if (i == 10) {
                            System.out.println("\n### Thread Bitti###");
                            System.out.println(i + ". => ID: " + myFileAnonymous.id + " Thread Name=>" + myFileAnonymous.threadName);
                        } else {
                            System.out.println(i + ". => ID: " + myFileAnonymous.id + " Thread Name=>" + myFileAnonymous.threadName);
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
