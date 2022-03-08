package ru.didyk.lesson_09March.firstTask.simpleTests;

import org.junit.jupiter.api.Test;
import ru.didyk.lesson_09March.firstTask.TextWithQuotesValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

class TextWithQuotesValidatorImplTest {

    private TextWithQuotesValidatorImpl validator = new TextWithQuotesValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("\"two words\""));
        assertTrue(validator.validate("\"word\""));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("\"42..\""));
        assertFalse(validator.validate("\"abc.def@mail\""));
    }

}