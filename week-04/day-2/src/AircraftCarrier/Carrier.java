package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Aircraft> store;
    private int HP;
    private int ammoStorage;

    public Carrier(int ammo) {
        store = new ArrayList<>();
        setHP(10000);
        ammoStorage = ammo;
    }

    public void add(Aircraft craft) {
        store.add(craft);
    }

    public void fill() throws Exception {
        if (ammoStorage == 0) {
            throw new Exception();
        }

        int ammoNeed = 0;
        for (Aircraft craft : store) {
            ammoNeed += craft.maxAmmo - craft.ammo;
        }

        if (ammoNeed > ammoStorage) {
            priorityFill();
        } else {
            for (Aircraft craft : store) {
                ammoStorage = craft.refill(ammoStorage);
                if (ammoStorage == 0) {
                    return;
                }
            }
        }
    }

    private void priorityFill() {
        for (Aircraft craft : store) {
            if (craft.isPriority()) {
                ammoStorage = craft.refill(ammoStorage);
                if (ammoStorage == 0) {
                    return;
                }
            }
        }
        for (Aircraft craft : store) {
            ammoStorage = craft.refill(ammoStorage);
            if (ammoStorage == 0) {
                return;
            }
        }
    }

    public void fight(Carrier enemyCarrier) {
        int totalDamage = 0;
        for (Aircraft craft : store) {
            totalDamage += craft.fight();
        }
        enemyCarrier.setHP(enemyCarrier.getHP() - totalDamage);
    }

    public String getStatus() {
        if (HP <= 0) {
            return "It's dead Jim :(";
        }
        int totalDamage = 0;
        StringBuilder builder = new StringBuilder();
        for (Aircraft craft : store) {
            builder.append("\n" + craft.getStatus());
            totalDamage += craft.allDamage;
        }
        return String.format("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d",
               HP, store.size(), ammoStorage, totalDamage) + builder;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

}
