package ru.didyk.lesson_14March.secondPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Alex D", "prof", 30);
        Student student2 = new Student("Waks D", "prof", 30);
        Student student3 = new Student("Alexs D", "prof", 30);
        Student student4 = new Student("Alex D", "prof", 30);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

//        System.out.println(getN(students, "Alex", "Alexs"));
        Map<String, Integer> t = getT(students);
        for (Map.Entry<String, Integer> entry : t.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }

    public static Map<String, Integer> getT(List<Student> students) {
//        return students.stream().collect(Collectors.groupingBy(s -> s.getFullName()));
        return students.stream().collect(Collectors.toMap(
                s -> s.getSpeciality(),
                s -> 1,
                Integer::sum
        ));
    }

    public static Double getGpa(List<Student> students) {
        return students.stream().mapToDouble(Student::getGpaScore).average().getAsDouble();
    }

    public static List<Student> getAvgMoreThan51(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGpaScore() > 51)
                .toList();
    }

    public static List<Student> getProfAndAvgGpaMoreThan100(List<Student> students, String prof) {
        return students.stream()
                .filter(s -> s.getSpeciality().toLowerCase().equals(prof) && s.getGpaScore() > 100)
                .toList();
    }

    public static List<Student> getN(List<Student> students, String name, String name1) {
        return students.stream()
                .filter(s -> s.getFullName().split(" ")[0].equals(name))
                .toList();
    }

//    public static Map<String, List<Student>> getSpeciality(List<Student> students) {
//        Map<String, List<Student>> listMap = new HashMap<>();
//        for (Student student : students) {
//            List<Student> sublist = listMap.getOrDefault(student.getSpeciality(), new ArrayList<>());
//            sublist.add(student);
//            listMap.put(student.getSpeciality(), sublist);
//        }
//        return listMap;
//    }
}
