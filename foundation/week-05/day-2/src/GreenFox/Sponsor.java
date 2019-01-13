package GreenFox;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println(String.format("Hi, I'm %s, a %d year old %s who represents " +
                "%s and hired %d students so far.", name, age, gender, company, hiredStudents));
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
