package GardenApp;

public class Plant {

    protected double waterAmount;
    protected String color;

    public Plant(String color) {
        this.color = color;
    }

    public void water(int amount) {
        waterAmount += amount;
    }

    public boolean needsWater() {
        return waterAmount < 0;
    }

    public String getColor() {
        return color;
    }


}
