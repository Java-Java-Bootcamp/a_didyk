package ru.didyk.lesson_04March.thirdPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operations = new String[] {"+", "-", "/", "*"};
        Calc calc = new Calc();

        System.out.println("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.println("Выберите знак: ");
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i]);
        }
        int operation = scanner.nextInt();

        calc.numbers(first, second, operation);
    }
}
