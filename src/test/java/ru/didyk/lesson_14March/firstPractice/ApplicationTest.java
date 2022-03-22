package ru.didyk.lesson_14March.firstPractice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    private static Worker age(String name, int age) {
        return new Worker(name, "~", Sex.MALE, age, "?", "Moscow");
    }

    private static Worker sex(String name, Sex sex) {
        return new Worker(name, "~", sex, 45, "?", "Moscow");
    }

    @Test
    void getYoungWorkers() {
        assertThat(Application.getYoungWorkers(List.of(
                age("x", 42),
                age("y", 22),
                age("z", 30),
                age("m", 18)
        ))).map(Worker::getName).containsExactly("y", "m");

        assertThat(Application.getYoungWorkers(List.of(
                age("x", 42),
                age("y", 62)
        ))).isEmpty();
    }

    @Test
    void getYoungWorkerMoreThan25Years() {

        assertThat(Application.getYoungWorkerMoreThan25Years(List.of(
                age("x", 42),
                age("y", 22),
                age("z", 30),
                age("m", 18)
        ))).map(Worker::getName).contains("y");

        assertThat(Application.getYoungWorkerMoreThan25Years(List.of(
                age("z", 30),
                age("x", 42)
        ))).isEmpty();
    }

    @Test
    void getMaleAndFemaleCount() {

        assertThat(Application.getMaleAndFemaleCount(List.of(
                sex("x", Sex.MALE),
                sex("x", Sex.FEMALE),
                sex("x", Sex.FEMALE)
        ))).containsExactlyInAnyOrderEntriesOf(Map.of(Sex.MALE, 1L, Sex.FEMALE, 2L));

        assertThat(Application.getMaleAndFemaleCount(List.of(
                sex("x", Sex.FEMALE),
                sex("x", Sex.FEMALE)
        ))).containsExactlyInAnyOrderEntriesOf(Map.of(Sex.FEMALE, 2L));
    }

    @Test
    void getHometown() {
    }

    @Test
    void getStringsOfEmployee() {
    }

    @Test
    void getEmployeesRetirees() {
    }
}