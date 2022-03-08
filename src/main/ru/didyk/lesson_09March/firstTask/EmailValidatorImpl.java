package ru.didyk.lesson_09March.firstTask;

import java.util.regex.Pattern;

public class EmailValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "email";
    }
}
