package ru.didyk.lesson_10March.firstPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayListEx arrayListEx = new ArrayListEx();

        int[] array = new int[arrayListEx.array.length];



        for (int j = 0; j < arrayListEx.array.length; j++) {
            array[j] = scanner.nextInt();
        }


        arrayListEx.fill(array);
//        arrayListEx.insert(3, 5);
        arrayListEx.delete(99);

        arrayListEx.print();
        System.out.println(arrayListEx.size());

        int size = 0;

    }


}
