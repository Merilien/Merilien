package GardenApp;

public abstract class Plant {

    protected double waterAmount;
    protected String color;
    protected double absorption;
    protected int waterNeed;

    public Plant(String color, double absorption, int waterNeed) {
        this.color = color;
        this.absorption = absorption;
        this.waterNeed = waterNeed;
    }

    public abstract void water(int amount);

    public abstract boolean needsWater();

    public String getColor() {
        return color;
    }

    public String toString() {
        return (String.format("The %s %s ", getColor(), getClass().getSimpleName()) +
                (needsWater() ? "needs water" : "doesn't need water"));
    }


}
