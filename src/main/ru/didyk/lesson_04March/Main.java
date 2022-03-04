package ru.didyk.lesson_04March;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        boolean cor = false;
        do {
            try {
                System.out.println("Введите первое число: ");
                a = new Scanner(System.in).nextInt();
                cor = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод");
            }
        }
        while (!cor);
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Введите знак: ");
        String[] operations = new String[] {"+", "-", "/", "*"};

        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i]);
        }

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Ответ: " + (a + b));
                break;
            case 2:
                System.out.println("Ответ: " + (a - b));
                break;
            case 3:
                System.out.println("Ответ: " + (a / b));
                break;
            case 4:
                System.out.println("Ответ: " + (a * b));
                break;
            default:
                System.out.println("Неверный ввод для операции");

        }
    }
}
