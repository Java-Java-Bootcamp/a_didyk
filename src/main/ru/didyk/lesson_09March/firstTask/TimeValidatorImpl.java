package ru.didyk.lesson_09March.firstTask;

import java.util.regex.Pattern;

public class TimeValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("\\d{2}\\.\\d*\\.(\\d{2}|\\d{4})\\s*\\d{2}:\\d{2}:*(\\d{2})?");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "time";
    }
}
