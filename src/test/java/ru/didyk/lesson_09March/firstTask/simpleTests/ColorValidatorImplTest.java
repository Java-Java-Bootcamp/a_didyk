package ru.didyk.lesson_09March.firstTask.simpleTests;

import org.junit.jupiter.api.Test;
import ru.didyk.lesson_09March.firstTask.ColorValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

class ColorValidatorImplTest {

    private ColorValidatorImpl colorValidator = new ColorValidatorImpl();

    @Test
    void valid() {
        assertTrue(colorValidator.validate("#AABB12"));
        assertTrue(colorValidator.validate("#777"));
    }

    @Test
    void invalid() {
        assertFalse(colorValidator.validate("42"));
        assertFalse(colorValidator.validate("abc.def@mail"));
    }

}