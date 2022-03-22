package ru.didyk.lesson_02March;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfRightAnswers = 0;

        String[] questionsArray = new String[]{
                "Сколько примитивных типов в Java: \n1. 8 \n2. 6",
                "Предок всех классов в Java: \n1. MainClass \n2. Object",
                "Число P: \n1. 3.14 \n2. 3.18"};
        int[] rightAnswersArray = new int[]{1, 2, 1};

        for (int i = 0; i < questionsArray.length; i++) {
            System.out.println(questionsArray[i]);
            int answer = scanner.nextInt();
            if (answer == rightAnswersArray[i]) {
                countOfRightAnswers++;
            }
            else if (answer > 2 || answer < 0) {
                System.out.println("Выберите из предложенных вариантов!");
                i--;
            }
        }
        System.out.println("Количество верных ответов: " + countOfRightAnswers);
    }
}
