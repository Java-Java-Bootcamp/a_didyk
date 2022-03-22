package ru.didyk.lesson_04March.secondPart.animals;

public class Animal {

    protected String food;
    protected String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void sleep() {
        System.out.println("i am sleeping");
    }

    void makeNoise() {
        System.out.println();
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
