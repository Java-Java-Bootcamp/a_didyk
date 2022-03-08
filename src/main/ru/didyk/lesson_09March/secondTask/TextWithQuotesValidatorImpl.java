package ru.didyk.lesson_09March.secondTask;

import java.util.regex.Pattern;

public class TextWithQuotesValidatorImpl extends AbstractValidator {

    public TextWithQuotesValidatorImpl() {
        pattern = Pattern.compile("\"\\w+\\s*\\w+\"");
    }

    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    public String name() {
        return "text with quotes";
    }
}
