package Pirates;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<>();
    private Pirate captain;
    private boolean hasCrew;

    public void fillShip() {
        captain = new Pirate();
        int crewSize = (int) (Math.random() * 101);
        for (int i = 0; i < crewSize; i++) {
            crew.add(new Pirate());
        }
        hasCrew = true;
    }

    public void printShipInfo() {
        if (!hasCrew) {
            System.out.println("The ship is empty");
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("The captain had %d drinks, ", captain.checkDrinks()));
            if (captain.checkAlive()) {
                builder.append("is alive");
                if (captain.checkConscious()) {
                    builder.append(" and conscious.");
                } else {
                    builder.append(" and has passed out.");
                }
            } else {
                builder.append("and has died.");
            }
            System.out.println(builder.toString());
            System.out.println(String.format("There are %d pirates left in the crew.", countLivePirates()));
        }
    }

    public boolean battle(Ship otherShip) {
        boolean won;
        if (this.calculateScore() > otherShip.calculateScore()) {
            won = true;
            otherShip.killSomePirates();
            haveParty();
        } else {
            won = false;
            killSomePirates();
            otherShip.haveParty();
        }
        return won;
    }

    private void killSomePirates() {
        int deaths = (int) (Math.random() * (crew.size() + 1));
        for (int i = 0; i < deaths; i++) {
            crew.get(i).getKilled();
        }
    }

    private void haveParty() {
        for (Pirate pirate : crew) {
            int drinks = (int) (Math.random() * 6);
            for (int i = 0; i < drinks; i++) {
                pirate.drinkSomeRum();
            }
        }
        for (int i = 0; i < ((int) (Math.random() * 6)); i++) {
            captain.drinkSomeRum();
        }
//        captain.howsItGoingMate();
    }

    private int calculateScore() {
        return (countLivePirates() - captain.checkDrinks());
    }

    public int countLivePirates() {
        int livePirates = 0;
        for (Pirate pirate : crew) {
            if (pirate.checkAlive()) {
                livePirates++;
            }
        }
        return livePirates;
    }
}
