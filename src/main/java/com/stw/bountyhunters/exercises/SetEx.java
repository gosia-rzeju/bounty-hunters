package com.stw.bountyhunters.exercises;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {

        Set<String> myHashSet = new HashSet<>();

        myHashSet.add("Ania");
        myHashSet.add("Zuzia");
        myHashSet.add("Jakub");
        myHashSet.add("Damian");

        for (String element : myHashSet) {
            System.out.println(element);
        }

        Set<String> myTreeSet = new TreeSet<>();

        myTreeSet.add("Z");
        myTreeSet.add("A");
        myTreeSet.add("H");
        myTreeSet.add("K");

        for (String s : myTreeSet) {
            System.out.println(s);
        }

        Comparator<Integer> comp = (Integer i1, Integer i2) -> Integer.compare(i2, i1);

        Set<Integer> myIntegerTreeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        myIntegerTreeSet = new TreeSet<>(comp);

        myIntegerTreeSet.add(9);
        myIntegerTreeSet.add(11);
        myIntegerTreeSet.add(3);
        myIntegerTreeSet.add(5);

        for (Integer integer : myIntegerTreeSet) {
            System.out.println(integer);
        }

        Set<Person> myPersonTreeSet = new TreeSet<>();

        Person person1 = new Person();
        person1.setFirstName("Piotr");
        person1.setLastName("Andrzejak");
        person1.setOrdinalNumber(10);

        Person person2 = new Person();
        person2.setFirstName("Gosia");
        person2.setLastName("Sobocinska");
        person2.setOrdinalNumber(15);

        Person person3 = new Person();
        person3.setFirstName("Andrzej");
        person3.setLastName("Micha");
        person3.setOrdinalNumber(5);

        myPersonTreeSet.add(person1);
        myPersonTreeSet.add(person2);
        myPersonTreeSet.add(person3);

        for (Person person : myPersonTreeSet) {
            System.out.println(person);
        }


    }
}
