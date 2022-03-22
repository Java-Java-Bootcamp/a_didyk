package ru.didyk.lesson_04March.secondPart.animals;

public class Dog extends Animal {

    private String name;
//    private String


    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Bow-wow");
    }

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
