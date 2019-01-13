package Printable;

import Comparable.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));

        Fleet fleet = new Fleet();
        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove the obstacles");
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat lunch");
        thing3.complete();
        thing4.complete();
        fleet.add(thing4);
        fleet.add(thing1);
        fleet.add(thing3);
        fleet.add(thing2);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Thing t : fleet.getThings()) {
            t.printAllFields();
        }
    }
}
