package ru.didyk.lesson_09March.firstLesson.secondTask;

import java.util.regex.Pattern;

public class NumbersWithPointValidatorImpl extends AbstractValidator {

    public NumbersWithPointValidatorImpl() {
        pattern = Pattern.compile("[-]?\\d+[.]?[\\d+]*");
    }

    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    public String name() {
        return "just number";
    }
}
