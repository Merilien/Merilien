package Flyable;

import main.java.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird birdie = new Bird("Jeff");
        Helicopter copter = new Helicopter();

        List<Flyable> flyers = new ArrayList<Flyable>();
        flyers.add(birdie);
        flyers.add(copter);

        for (Flyable flyer : flyers) {
            flyer.takeOff();
            flyer.fly();
            flyer.land();
        }
    }
}
