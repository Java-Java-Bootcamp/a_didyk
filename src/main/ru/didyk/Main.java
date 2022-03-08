package ru.didyk;


import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        System.out.println(StringUtils.leftPad("012", 5, "0"));
        System.out.println("Hello");


        IntStream s = IntStream.range(1, 100);
        List<Object> list = new ArrayList<Object>();
        list.add(4);
        list.add("we");
        list.add("ew");
        list.stream()
                .filter(a -> a instanceof String)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        String[] array = new String[]{"a", "b", "c"};
        String v = Arrays.stream(array).collect(Collectors.joining(", "));
        System.out.println(v);


        s.filter(a -> a % 2 == 0 && a > 50)
                .map(a -> Integer.parseInt(String.valueOf(a)))
                .forEach(System.out::println);

        int a = s.reduce(0, (x, y) -> x + y);
        System.out.println(a);

        Map<Integer, Integer> map = IntStream.range(1, 100)
                .boxed()
                .collect(
                        Collectors.toConcurrentMap(
                                k -> k % 42, val -> val, (q, b) -> b)
                );

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.println(String.format("%d %s", 10, "sd"));

        logger.info("Server is started");
        logger.log(Level.SEVERE, "Can't open file");
    }
}