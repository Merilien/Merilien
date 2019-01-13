package PetrolStation;

public class Station {
    private int gasAmount;

    public Station() {
        setGasAmount(100000);
    }

    public void refill(Car car) {
        this.gasAmount -= car.getCapacity() - car.getGasAmount();
        car.setGasAmount(car.getCapacity());
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int amount) {
        this.gasAmount = amount;
    }
}
