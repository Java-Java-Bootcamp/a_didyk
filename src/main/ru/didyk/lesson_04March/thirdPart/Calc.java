package ru.didyk.lesson_04March.thirdPart;

public class Calc implements Sum, Div, Pro, Vych {

    public void numbers(int firstNumber, int secondNumber, int operationNumber) {
        switch (operationNumber) {
            case 1:
                sum(firstNumber, secondNumber);
                break;
            case 2:
                vych(firstNumber, secondNumber);
                break;
            case 3:
                div(firstNumber, secondNumber);
                break;
            case 4:
                pro(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неверный тип операции");
        }
    }

    @Override
    public double div(int a, int b) {
        System.out.println("Частное: " + ((a * 1.0) / b));
        return (a * 1.0) / b;
    }

    @Override
    public int pro(int a, int b) {
        System.out.println("Произведение: " + (a * b));
        return a * b;
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("Сумма равна: " + (a + b));
        return a + b;
    }

    @Override
    public int vych(int a, int b) {
        System.out.println("Разность: " + (a - b));
        return a - b;
    }
}
