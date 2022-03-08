package ru.didyk.lesson_09March.firstTask.param;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.didyk.lesson_09March.firstTask.TextWithQuotesValidatorImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextWithQuotesValidatorImplTest {

    private TextWithQuotesValidatorImpl validator = new TextWithQuotesValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = { "\"two words\"", "\"word\""})
    void valid(String candidate) {
        assertTrue(validator.validate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "+", "-+42", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(validator.validate(candidate));
    }

}