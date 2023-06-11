package com.hamitmizrak.lesson10_Collection;

import java.util.*;

public class _2_Set {
    public static void main(String[] args) {
        // LinkedList, ArrayList
        //List list=new LinkedList();
        //ArrayList list=new ArrayList();
        //List<Integer> list=new ArrayList<Integer>();
        //Set<Integer> list=new HashSet<>(); //kendi kafasına göre sırlaama yapıyor
        Set<Integer> list=new LinkedHashSet<Integer>(); //kendi kafasına göre sırlaama yapıyor
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(8);

        /*System.out.println(list.isEmpty());
        System.out.println("***********************************");
        list.remove(0);
        System.out.println("\n***********************************");
        // foreach
        for ( Integer temp: list ){
            System.out.print(temp+" ");
        }
        System.out.println("\n***********************************");
        System.out.println( list.contains(7));

        System.out.println("Hash Code "+list.hashCode());
        //list.clear();

        System.out.println("\n***********************************");
        // foreach(Java 8)
      *//*  list.stream().forEach((temp)-> System.out.println(temp));*//*
        list.stream().forEach(
                (temp)-> {System.out.print(temp+" ");
                }
                );
       *//* list.stream().forEach(System.out::println);*//*
        System.out.println("\n***********************************");
        Object[] listToArray=  list.toArray();
        System.out.println(listToArray[0]);
        System.out.println("\n***********************************");*/

        list.stream().forEach(
                (temp)-> {System.out.print(temp+" ");
                }
        );

    }
}
