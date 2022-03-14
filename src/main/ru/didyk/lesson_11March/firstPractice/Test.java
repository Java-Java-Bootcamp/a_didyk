package ru.didyk.lesson_11March.firstPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list.add(0,10);
        list.addAll(list1);

        System.out.println(list);
    }
}
