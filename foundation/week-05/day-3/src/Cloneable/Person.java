package Cloneable;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s.", name, age, gender));
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
