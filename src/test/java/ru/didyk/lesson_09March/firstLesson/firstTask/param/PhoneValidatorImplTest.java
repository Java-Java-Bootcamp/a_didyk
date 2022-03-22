package ru.didyk.lesson_09March.firstLesson.firstTask.param;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.didyk.lesson_09March.firstLesson.firstTask.PhoneValidatorImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneValidatorImplTest {

    private PhoneValidatorImpl validator = new PhoneValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = { "+79604802318", "89546758934", "8(495)5674321"})
    void valid(String candidate) {
        assertTrue(validator.validate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "+", "-+42", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(validator.validate(candidate));
    }

}