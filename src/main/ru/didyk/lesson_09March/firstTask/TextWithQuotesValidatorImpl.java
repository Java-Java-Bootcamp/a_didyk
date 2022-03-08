package ru.didyk.lesson_09March.firstTask;

import java.util.regex.Pattern;

public class TextWithQuotesValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("\"\\w+[\\s+]?\\w+\"");


    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "text with quotes";
    }
}
