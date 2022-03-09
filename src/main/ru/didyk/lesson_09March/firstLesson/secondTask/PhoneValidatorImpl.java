package ru.didyk.lesson_09March.firstLesson.secondTask;

import java.util.regex.Pattern;

public class PhoneValidatorImpl extends AbstractValidator {

    public PhoneValidatorImpl() {
        pattern = Pattern.compile("(8|\\+7)(((\\([4-9]\\d{2}\\))\\d{7})|\\d{10})");
    }

    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    public String name() {
        return "phone number";
    }
}
