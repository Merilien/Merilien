package main.java.animals;

public class Bird extends Animal implements EggBreeder {


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
}
