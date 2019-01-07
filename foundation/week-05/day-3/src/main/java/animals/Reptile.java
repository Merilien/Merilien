package main.java.animals;

public class Reptile extends Animal implements EggBreeder {

    public Reptile(String name) {
        this.name = name;
        age = 20;
        sex = "female";
        food = "insects";
    }

    public Reptile(String name, int age, String sex, String food) {
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
