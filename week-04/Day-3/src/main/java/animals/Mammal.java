package main.java.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
        age = 5;
        sex = "male";
        food = "leaves";
    }

    public Mammal(String name, int age, String sex, String food) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.food = food;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }
}
