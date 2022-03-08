package ru.didyk.lesson_09March.firstTask;

import java.util.regex.Pattern;

public class NumbersWithPointValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("[-]?\\d+[.]?\\d+");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "just number";
    }
}
