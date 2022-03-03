package ru.didyk.lesson_02March;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        reverseArray(array);
        average(array);
    }

    public static int[] reverseArray(int[] array) {
        ArrayUtil.printArray(array);
        // TODO реализуйте код для создания перевернутого массива
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - i - 1];
        }

        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static float average(int[] array) {
        ArrayUtil.printArray(array);
        // TODO реализуйте код для расчета среднего значения
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        count /= array.length;

        System.out.println(count);
        return count;
    }
}
