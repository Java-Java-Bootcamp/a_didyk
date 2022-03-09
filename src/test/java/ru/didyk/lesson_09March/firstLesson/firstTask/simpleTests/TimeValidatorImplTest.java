package ru.didyk.lesson_09March.firstLesson.firstTask.simpleTests;

import org.junit.jupiter.api.Test;
import ru.didyk.lesson_09March.firstLesson.firstTask.TimeValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

class TimeValidatorImplTest {

    private TimeValidatorImpl timeValidator = new TimeValidatorImpl();
    @Test
    void valid() {
        assertTrue(timeValidator.validate("12.3.2022 17:45"));
        assertTrue(timeValidator.validate("12.3.20 17:45:33"));
    }

    @Test
    void invalid() {
        assertFalse(timeValidator.validate("\"42..\""));
        assertFalse(timeValidator.validate("\"abc.def@mail\""));
    }

}