package com.stw.bountyhunters.exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingLetters {

    public static void main(String[] args) {

        String argument = "wwwbbbwggggggk";

        getResult(argument);

        System.out.println(getRealResult(argument));
    }

    public static String getResult(String argument) {

        Map<String, Integer> lettersCounter = new LinkedHashMap<>();

        String[] letters = argument.split("");

        for (String letter : letters) {
            if (!lettersCounter.containsKey(letter)) {
                lettersCounter.put(letter, 1);
            } else {
                lettersCounter.put(letter, lettersCounter.get(letter) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : lettersCounter.entrySet()) {
            System.out.println("Letters count is: " + entry.getKey() + entry.getValue());
        }

        return null;
    }

    public static String getRealResult(String argument) {

        String[] letters = argument.split("");

        int counter = 1;
        String result = "";
        for (int i = 1; i < letters.length; i++) {
            if (letters[i - 1].equals(letters[i])) {
                counter++;
            } else {
                result = result + counter + letters[i - 1];
                counter = 1;
            }
        }
        return result + counter + letters[letters.length - 1];
    }
}
