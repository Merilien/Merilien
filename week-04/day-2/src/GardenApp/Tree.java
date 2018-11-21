package GardenApp;

public class Tree extends Plant {

    public Tree(String color) {
        super(color, 0.4, 10);
    }

    public void water(int amount) {
        waterAmount += amount * absorption;
    }

    public boolean needsWater() {
        return waterAmount < waterNeed;
    }

}
