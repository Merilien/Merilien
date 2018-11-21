package Flyable;

public class Helicopter extends Vehicle implements Flyable {


    public Helicopter() {
        environment = "air";
        wheels = 0;
        size = "medium";
    }

    @Override
    public void land() {
        System.out.println("plop.");
    }

    @Override
    public void fly() {
        System.out.println("vrrrrrrrrrrrr");
    }

    @Override
    public void takeOff() {
        System.out.println("vrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
