package com.stw.bountyhunters.exercises;

public class StudentsEx {

    public static void main(String[] args) {

        int K = 8;
        int students = 4;

        Integer[] arr = new Integer[K + 1];
        arr[0] = K;

        for (int i = 1; i <arr.length; i++) {
            int occupiedDesk = (int) (Math.random() * (K - 1));
        }

        System.out.println("Result is: " + getResult(arr));
    }

    public static int getResult(Integer[] arr) {

        int K = arr[0];
        int size = K - arr.length + 1;

        Integer[] freeDesks = new Integer[size];

        int index = 0;
        for (int i = 1; i < K + 1; i++) {
            Boolean isOccupied = false;
                for (int j = 1; j < arr.length; j++) {
                    if (i == arr[j]) {
                        isOccupied = true;
                    }
            }
            if (!isOccupied) {
                freeDesks[index] = i;
                index++;
            }
        }

        for (Integer freeDesk : freeDesks) {
            System.out.println(freeDesk);
        }

        int result = 0;
        for (int i = 0; i < freeDesks.length; i++) {
            for (int j = 0; j < freeDesks.length; j++) {
                if ((freeDesks[i] - freeDesks[j] == 1 && (i + j) % 2 != 1) || freeDesks[i] - freeDesks[j] == 2) {
                    result++;
                }
            }
        }
        return result;
    }

}
