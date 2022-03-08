package ru.didyk.lesson_09March.secondTask;

import java.util.regex.Pattern;

public class ColorValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("#\\w+");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "color from html page";
    }
}
