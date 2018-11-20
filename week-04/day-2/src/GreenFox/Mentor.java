package GreenFox;

public class Mentor extends Person {
    private String level;

    public Mentor() {
        super();
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s %s mentor.", name, age, gender, level));
    }
}
