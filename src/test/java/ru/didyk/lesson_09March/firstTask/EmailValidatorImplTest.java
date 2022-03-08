package ru.didyk.lesson_09March.firstTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorImplTest {

    private EmailValidatorImpl validator = new EmailValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("abcdef@mail.ru"));
        assertTrue(validator.validate("h@mail.ru"));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("42"));
        assertFalse(validator.validate("abc.def@mail"));
    }

}