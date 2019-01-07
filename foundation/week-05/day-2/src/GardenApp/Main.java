package GardenApp;

public class Main {
    public static void main(String[] args) {

        Garden myGarden = new Garden();
        myGarden.addPlant(new Flower("yellow"));
        myGarden.addPlant(new Flower("blue"));
        myGarden.addPlant(new Tree("purple"));
        myGarden.addPlant(new Tree("orange"));

        myGarden.waterGarden(40);
        myGarden.waterGarden(70);
        myGarden.getInfo();

    }
}
