package com.stw.bountyhunters.exercises;

import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class PalindromEx {

    public static void main(String[] args) {

        String argument = "mmmop";

        System.out.println(stringChallenge(argument));
    }

    public static String stringChallenge(String str) {

        if (str.length() < 3) {
            throw new IllegalArgumentException("Passed argument is to short. Argument length is: " + str.length());
        }

        String[] letters = str.split("");

        for (String letter : letters) {
            System.out.println(letter);
        }

        int j = 0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str.length() / 2; i++) {
            if (!letters[i].equals(letters[letters.length - 1 - i])) {
                    indexes.add(i);
                    j++;
            }
        }

        if (indexes.get(0) != null) {
            for (Integer index : indexes) {
                System.out.println("Unequal index is: " + index);
            }
        }

        List<Pair<Boolean, Integer>> pairs = new ArrayList<>();
        for (Integer index : indexes) {
            Pair<Boolean, Integer> pair = Pair.of(checkingPalindromWithoutLetter(index, letters), index);
            Pair<Boolean, Integer> reversPair = Pair.of(checkingPalindromWithoutLetter(letters.length - 1 - index, letters), letters.length - 1 - index);
            pairs.add(pair);
            pairs.add(reversPair);
        }

        int removedIndex = -1;
        for (Pair<Boolean, Integer> pair : pairs) {
            System.out.println("Pair is: " + pair.toString());
            if (pair.getFirst()) {
                removedIndex = pair.getSecond();
            }
        }

        if (removedIndex >= 0) {
            System.out.println("Index to remove is: " + removedIndex);
        } else {
        }

        String result = "";


        return "Letters for delete are: " + result;
    }

    public static Boolean checkingPalindromWithoutLetter(int index, String[] str) {

        List<String> wordForPalindrom = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (i != index) {
                wordForPalindrom.add(str[i]);
            }
        }

        Boolean isPalindrom = true;
        for (int i = 0; i < wordForPalindrom.size() / 2; i++) {
            if(!wordForPalindrom.get(i).equals(wordForPalindrom.get(wordForPalindrom.size() - 1 - i))) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }


}
