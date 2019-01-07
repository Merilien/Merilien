package main.java.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String sex;
    protected String food;

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(String.format("%s is eating %s", getName(), food));
    }

    public abstract String breed();

}
