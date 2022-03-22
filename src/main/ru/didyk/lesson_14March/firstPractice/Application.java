package ru.didyk.lesson_14March.firstPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        Worker worker1 = new Worker("A", "B", Sex.MALE, 60, "Prog", "Moscow");
        Worker worker2 = new Worker("Aa", "Bb", Sex.FEMALE, 50, "Teacher", "Ivanovo");
        Worker worker3 = new Worker("Aaa", "Bbb", Sex.MALE, 61, "Engineer", "EKB");
        Worker worker4 = new Worker("Aaaa", "Bbbb", Sex.FEMALE, 59, "Driver", "St. Petersburg");

        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);


        System.out.println(getYoungWorkers(workers));
        System.out.println(getYoungWorkerMoreThan25Years(workers));
        System.out.println(getMaleAndFemaleCount(workers));
        System.out.println(getHometown(workers));
        System.out.println(getStringsOfEmployee(workers));
        System.out.println(getEmployeesRetirees(workers, 65));



    }

    public static List<Worker> getYoungWorkers(List<Worker> workers) {
        return workers.stream()
                .filter(w -> w.getAge() < 30)
                .collect(Collectors.toList());
    }

    public static Optional<Worker> getYoungWorkerMoreThan25Years(List<Worker> workers) {
        return workers.stream()
                .filter(w -> w.getAge() < 25)
                .findFirst();
    }

    public static Map<Sex, Long> getMaleAndFemaleCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        Worker::getSex,
                        Collectors.counting()
                ));
    }

    public static Map<String, List<Worker>> getHometown(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        Worker::getWorkTown
                ));
    }

    public static List<String> getStringsOfEmployee(List<Worker> workers) {
        return workers.stream()
                .map(it -> String.format("%s, %s, %s, %s",
                        it.getSurname().toUpperCase(),
                        it.getName().toUpperCase(),
                        it.getAge(),
                        it.getWorkTown()))
                .toList();
    }

    public static List<Worker> getEmployeesRetirees(List<Worker> workers, int ageOfRetiree) {
        return workers.stream()
                .filter(w -> ageOfRetiree - w.getAge() < 5)
                .collect(Collectors.toList());
    }

}
