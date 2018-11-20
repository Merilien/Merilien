package GardenApp;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    public void water(int amount) {
        waterAmount += amount * 0.75;
    }

    public boolean needsWater() {
        return waterAmount < 5;
    }

}
