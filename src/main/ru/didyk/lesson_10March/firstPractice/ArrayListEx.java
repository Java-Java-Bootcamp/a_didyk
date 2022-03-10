package ru.didyk.lesson_10March.firstPractice;

import java.util.Arrays;

public class ArrayListEx {

    public int[] array = new int[5];

    public int[] fill(int... args) {
        for (int i = 0; i < args.length; i++) {
            array[i] = args[i];
        }
        return array;
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public void changeSize() {

    }

    public void insert(int index, int value) {
        int count = 0;
        int[] array1;
        if (index > array.length) {
            array1 = new int[index + 1];
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array1[index] = value;
        } else {
            array1 = new int[array.length + 1];
            for (int i = 0; i < array1.length; i++) {
                if (i != index) {
                    array1[i] = array[count];
                    count++;
                } else {
                    array1[i] = value;
                    count--;
                }
            }
        }
        array = array1;
    }

    public void replace(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = value;
            }
        }
    }

    public int get(int index) {
        return array[index];
    }

    public void delete(int value) {
        int[] array1 = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array[i] == value) {
                array1[i] = array[count];
                count++;
            }
            array1[i] = array[count];
            count++;
        }
        array = array1;
    }

    public int size() {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
             amount = i + 1;
        }
        return amount;
    }
}
