package Farm;


import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals = new ArrayList<>();
    private int slots;

    public Farm(int size){
        this.slots = size;
    }

    public void breed(){
        if (slots < 1){
            System.out.println("No space left for new animals :(");
        }
        else {
            animals.add(new Animal());
            slots--;
        }
    }

    public void setFree(){
        int leastHungry = 0;
        int minHunger = animals.get(0).getHunger();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getHunger() < minHunger){
                leastHungry = i;
                minHunger = animals.get(i).getHunger();
            }
        }
        animals.remove(leastHungry);
    }

    public Animal getAnimal(int i){
        return animals.get(i);
    }
}
