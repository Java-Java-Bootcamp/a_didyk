package ru.didyk.lesson_04March.secondPart.animals;

public class Main {
    public static void main(String[] args) {
//        Dog rex = new Dog();
//        rex.sleep();
//        System.out.println(rex);

        Dog dog = new Dog("Meat", "Sochi");
//        Cat cat = new Cat();
//        cat.eat();

        Veterinar veterinar = new Veterinar();
        veterinar.treatAnimal(dog);
    }
}
