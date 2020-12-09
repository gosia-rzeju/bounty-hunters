package com.stw.bountyhunters.exercises;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private Integer ordinalNumber;

    @Override
    public int compareTo(Person o) {
        return ordinalNumber - o.getOrdinalNumber();
    }
}
