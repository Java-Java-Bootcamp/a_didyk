package ru.didyk.lesson_04March.secondPart.animals;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
