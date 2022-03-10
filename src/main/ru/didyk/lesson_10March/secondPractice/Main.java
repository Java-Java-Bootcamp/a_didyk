package ru.didyk.lesson_10March.secondPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = {9, 3, 8, 5, 1};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

//
        int[] array = {9, 3, 8, 5, 1};
//        int[] array = {1, 2, 3, 1, 5};
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] < array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
