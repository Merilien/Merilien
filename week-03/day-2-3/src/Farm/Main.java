package Farm;

public class Main {

    public static void main(String[] args) {
        Farm myFarm = new Farm(10);
        for (int i = 0; i < 11; i++) {
            myFarm.breed();
        }
        myFarm.getAnimal(0).eat();
        myFarm.getAnimal(0).eat();
        myFarm.getAnimal(0).eat();
        System.out.println(myFarm.getAnimal(0).getHunger());
        myFarm.setFree();
        System.out.println(myFarm.getAnimal(0).getHunger());
    }
}
