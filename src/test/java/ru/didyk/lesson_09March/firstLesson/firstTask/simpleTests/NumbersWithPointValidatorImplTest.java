package ru.didyk.lesson_09March.firstLesson.firstTask.simpleTests;

import org.junit.jupiter.api.Test;
import ru.didyk.lesson_09March.firstLesson.firstTask.NumbersWithPointValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithPointValidatorImplTest {

    private NumbersWithPointValidatorImpl validator = new NumbersWithPointValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("23.78"));
        assertTrue(validator.validate("-77.234"));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("345,234"));
        assertFalse(validator.validate("abc.def@mail"));
    }

}