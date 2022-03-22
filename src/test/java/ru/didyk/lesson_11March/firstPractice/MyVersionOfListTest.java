package ru.didyk.lesson_11March.firstPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyVersionOfListTest {

    @Test
    void emptyList() {
        var list = new MyVersionOfList<String>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());

    }
}