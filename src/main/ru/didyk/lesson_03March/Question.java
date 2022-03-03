package ru.didyk.lesson_03March;

import java.util.List;

public class Question {

    private String text;
    private List<String> answers;
    private int validAnswers;


    public int isValidAnswer(int no) {
        return 0;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", answers=" + answers +
                ", validAnswers=" + validAnswers +
                '}';
    }
}
