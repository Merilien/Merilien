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
            if (plant.needsWater()) {
                System.out.println(String.format("The %s %s needs water", plant.getColor(), plant.getClass().getSimpleName()));
            } else {
                System.out.println(String.format("The %s %s doesn't need water", plant.getColor(), plant.getClass().getSimpleName()));
            }
        }
    }

    public void waterGarden(int amount) {
        System.out.println(String.format("Watering with %d", amount));
        List<Plant> thirstyPlants = new ArrayList<>();
        for (Plant plant : plants) {
            if (plant.needsWater()) {
                thirstyPlants.add(plant);
            }
        }
        for (Plant plant : thirstyPlants) {
            plant.water(amount/thirstyPlants.size());
        }
        getInfo();
    }

}
