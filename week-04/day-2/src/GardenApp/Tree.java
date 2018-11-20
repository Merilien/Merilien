package GardenApp;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    public void water(int amount) {
        waterAmount += amount * 0.4;
    }

    public boolean needsWater() {
        return waterAmount < 10;
    }

}
