package ru.didyk.lesson_09March.secondTask;

import java.util.regex.Pattern;

public abstract class AbstractValidator {

    protected Pattern pattern;

    public abstract boolean validate(String string);
    public abstract String name();
}
