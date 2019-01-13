package PetrolStation;

public class Car {
    private int gasAmount;
    private int capacity;

    public Car() {
        this.setGasAmount(0);
        this.setCapacity(100);
    }

    public int getGasAmount() {
        return this.gasAmount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setGasAmount(int amount) {
        this.gasAmount = amount;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
