package ru.didyk.lesson_09March.secondLesson;

import java.util.regex.Pattern;

public interface Numbers {
    Pattern createRegexPattern(String listString);
    boolean isMsisdnValid(String msisdn);
}
