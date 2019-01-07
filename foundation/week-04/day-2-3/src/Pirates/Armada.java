package Pirates;

import java.util.ArrayList;

public class Armada {
    private ArrayList<Ship> ships = new ArrayList<>();

    public void fillArmada(){
//        int ArmadaSize = (int)(Math.random()*101);
        int ArmadaSize = 50;
        for (int i = 0; i < ArmadaSize; i++) {
            Ship ship = new Ship();
            ship.fillShip();
            ships.add(ship);
        }
    }

    public int getArmadaSize(){
        return ships.size();
    }

    public boolean war(Armada otherArmada){
        boolean over = false;
        boolean won = false;
        int thisIndex = 0;
        int otherIndex = 0;
        while (!over) {
            if (ships.get(thisIndex).battle(otherArmada.ships.get(otherIndex))){
                otherIndex++;
                System.out.println("Enemy ship no " + (otherIndex + 1) + " out!");
            }
            else{
                thisIndex++;
                System.out.println("Ship no " + (thisIndex + 1) + " out!");
            }
            if ((thisIndex + 1) == getArmadaSize()){
                over = true;
                won = false;
            }
            else if ((otherIndex+1) == otherArmada.getArmadaSize()){
                over = true;
                won = true;
            }
        }
        return won;
    }

}
