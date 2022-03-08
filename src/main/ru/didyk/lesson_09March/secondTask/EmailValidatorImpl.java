package ru.didyk.lesson_09March.secondTask;

import java.util.regex.Pattern;

public class EmailValidatorImpl extends AbstractValidator {

    public EmailValidatorImpl() {
        pattern = Pattern.compile("\\w+\\S*\\w?@\\w+\\.\\w+");
    }

    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    public String name() {
        return "email";
    }
}
