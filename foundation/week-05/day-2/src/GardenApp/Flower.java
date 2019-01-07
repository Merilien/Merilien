package GardenApp;

public class Flower extends Plant {

    public Flower(String color) {
        super(color, 0.75, 5);
    }

    public void water(int amount) {
        waterAmount += amount * absorption;
    }

    public boolean needsWater() {
        return waterAmount < waterNeed;
    }

}
