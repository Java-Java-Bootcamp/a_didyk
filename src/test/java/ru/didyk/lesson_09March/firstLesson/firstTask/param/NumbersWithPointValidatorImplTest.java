package ru.didyk.lesson_09March.firstLesson.firstTask.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.didyk.lesson_09March.firstLesson.firstTask.NumbersWithPointValidatorImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumbersWithPointValidatorImplTest {

    private NumbersWithPointValidatorImpl validator = new NumbersWithPointValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = {"-78.6", "7.32", "90"})
    void valid(String candidate) {
        assertTrue(validator.validate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+", "-+42", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(validator.validate(candidate));
    }

}