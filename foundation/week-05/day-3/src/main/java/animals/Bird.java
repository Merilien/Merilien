package main.java.animals;


import Flyable.Flyable;

public class Bird extends Animal implements EggBreeder, Flyable {


    public Bird(String name) {
        this.name = name;
        age = 1;
        sex = "female";
        food = "seeds";
    }

    public Bird(String name, int age, String sex, String food) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.food = food;
    }

    @Override
    public String breedWithEgg() {
        return "laying eggs.";
    }

    @Override
    public String breed() {
        return breedWithEgg();
    }

    @Override
    public void land() {
        System.out.println("puff");
    }

    @Override
    public void fly() {
        System.out.println("flapflap");
    }

    @Override
    public void takeOff() {
        System.out.println("swoosh");
    }
}
