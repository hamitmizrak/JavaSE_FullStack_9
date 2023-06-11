package com.hamitmizrak.lesson10_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class _3_Map {

    public static void main(String[] args) {
        Map<String,Object> mapList=new HashMap<String,Object>();
        mapList.put(UUID.randomUUID().toString(),"Malatya");
        mapList.put(UUID.randomUUID().toString(),"Ankara");
        mapList.put(UUID.randomUUID().toString(),"Sivas");
        mapList.put(UUID.randomUUID().toString(),"Diyarbakır");

        for (String key :mapList.keySet()) {
            System.out.println(key);
        }

        for (Object value :mapList.values()) {
            System.out.println(value);
        }

        for (String key :mapList.keySet()) {
            System.out.println(key+" => "+mapList.get(key));
        }

        System.out.println("*********KISA***************************");
        mapList.entrySet().forEach(System.out::println);


    }
}
