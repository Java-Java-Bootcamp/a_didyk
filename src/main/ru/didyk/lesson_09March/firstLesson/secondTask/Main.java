package ru.didyk.lesson_09March.firstLesson.secondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractValidator[] myValidators = {new ColorValidatorImpl(), new EmailValidatorImpl(),
                new NumbersWithPointValidatorImpl(), new PhoneValidatorImpl(), new TextWithQuotesValidatorImpl(),
                new TimeValidatorImpl()};
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                break;
            }

            boolean ok = false;
            for (AbstractValidator myValidator : myValidators) {
                if (myValidator.validate(string)) {
                    System.out.println("It's " + myValidator.name());
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println("i don't know");
            }
        }
    }
}
