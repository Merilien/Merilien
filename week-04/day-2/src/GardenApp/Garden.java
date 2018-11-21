package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void getInfo() {
        for (Plant plant : plants) {
            System.out.println(plant.toString());
        }
    }

    public void waterGarden(int amount) {
        System.out.println(String.format("Watering with %d", amount));

        List<Plant> thirstyPlants = new ArrayList<>();
        for (Plant plant : plants) {
            System.out.println(plant.toString());
            if (plant.needsWater()) {
                thirstyPlants.add(plant);
            }
        }

        amount /= thirstyPlants.size();
        for (Plant plant : thirstyPlants) {
            plant.water(amount);
        }
    }

}
