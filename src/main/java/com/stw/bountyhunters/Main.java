package com.stw.bountyhunters;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String abc_1 = "a" + "b" + "c";

        StringBuilder sb = new StringBuilder();
        String abc_2 = sb.append("a").append("b").append("c").toString();

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "One");
        myMap.put(null, "Jajko");
        myMap.put(null, "Masło");
        myMap.put(null, null);
        myMap.put(3, "Two");
        myMap.put(2, "Three");
        myMap.put(4, "Four");


        System.out.println("String 1 " + abc_1);
        System.out.println("String 2 " + abc_2);
        System.out.println("Memory address is " + System.identityHashCode(abc_1));
        System.out.println("Memory address is " + System.identityHashCode(myMap));
        System.out.println("Hash code is " + myMap.hashCode());

        abc_1 = "New";
        System.out.println("Memory address is " + System.identityHashCode(abc_1));

        System.out.println(myMap.get(null));

        for(Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        myMap.forEach((k, v) -> System.out.println(k + ":" + v));

        myMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


    }
}
